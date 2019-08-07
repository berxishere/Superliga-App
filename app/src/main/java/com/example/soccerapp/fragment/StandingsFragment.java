package com.example.soccerapp.fragment;


import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soccerapp.R;
import com.example.soccerapp.Standings.StandingDatum;
import com.example.soccerapp.Standings.StandingsResult;
import com.example.soccerapp.adapter.StandingsAdapter;
import com.example.soccerapp.app.Api;
import com.example.soccerapp.app.App;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StandingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StandingsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    final int SEASON_ID = 16020;

    Api api;
    RecyclerView recycler;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ProgressDialog progressDialog;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    SwipeRefreshLayout refreshLayout;


    public StandingsFragment() {
        // Required empty public constructor
    }

    public static StandingsFragment newInstance(String param1, String param2) {
        StandingsFragment fragment = new StandingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_standings, container,false);

        recycler = (RecyclerView) view.findViewById(R.id.recycler_standings);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        refreshLayout=view.findViewById(R.id.swp_refresh);
        progressDialog=dialog(getActivity());
        dialogShow(getActivity(),progressDialog);
        refreshLayout.setRefreshing(true);
        refreshLayout.setOnRefreshListener(this);

        getStandings();

        return view;
    }

    public static ProgressDialog dialog(Activity activity) {
        ProgressDialog dialog;

        dialog = new ProgressDialog(activity, R.style.ProgressBarTheme);
        dialog.setCancelable(false);
        dialog.setIndeterminateDrawable(activity
                .getResources().getDrawable(R.drawable.progress));
        return dialog;
    }

    public static void dialogDismiss(Activity activity, Dialog dialog) {
        if (activity != null) if (dialog != null && dialog.isShowing() && !activity.isDestroyed()
                && !activity.isFinishing())
            dialog.dismiss();
    }

    public static void dialogShow(Activity activity, Dialog dialog) {
        if (activity != null) if (dialog != null && !dialog.isShowing() && !activity.isDestroyed()
                && !activity.isFinishing())
            dialog.show();
    }
    private void getStandings(){
        api = App.getApi();
        api.getStandings(SEASON_ID).enqueue(new Callback<StandingsResult>() {
            @Override
            public void onResponse(Call<StandingsResult> call, Response<StandingsResult> response) {
                dialogDismiss(getActivity(),progressDialog);
                refreshLayout.setRefreshing(false);
                StandingsResult standingsResult = response.body();
                showStandings(standingsResult.getData().get(0).getStandings().getData());
            }

            @Override
            public void onFailure(Call<StandingsResult> call, Throwable t) {

            }
        });
    }

    private void showStandings(List<StandingDatum> standings){
        StandingsAdapter adapter = new StandingsAdapter(standings);
        recycler.setAdapter(adapter);
    }

    @Override
    public void onRefresh() {
        refreshLayout.setRefreshing(true);
        getStandings();
    }
}
