package com.example.soccerapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soccerapp.R;
import com.example.soccerapp.TopscorersModel.Goalscorers;
import com.example.soccerapp.TopscorersModel.GoalscorersDatum;
import com.example.soccerapp.TopscorersModel.TopscorersResult;
import com.example.soccerapp.adapter.TopscorersAdapter;
import com.example.soccerapp.app.Api;
import com.example.soccerapp.app.App;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TopscorersFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    final int SEASON_ID = 16020;
    final String INCLUDE = "goalscorers.player";

    Api api;
    RecyclerView recycler;

    public TopscorersFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TopscorersFragment newInstance(String param1, String param2) {
        TopscorersFragment fragment = new TopscorersFragment();
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
        View view = inflater.inflate(R.layout.fragment_topscorers, container, false);
        recycler = (RecyclerView) view.findViewById(R.id.recycler_topscorers);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        getTopscorers();
        return view;
    }

    private void getTopscorers() {
        api = App.getApi();
        api.getTopscorers(SEASON_ID,INCLUDE).enqueue(new Callback<TopscorersResult>() {
            @Override
            public void onResponse(Call<TopscorersResult> call, Response<TopscorersResult> response) {
                TopscorersResult topscorersResult = response.body();
                showTopscorers(topscorersResult.getData().getGoalscorers().getData());
            }

            @Override
            public void onFailure(Call<TopscorersResult> call, Throwable t) {

            }
        });
    }

    private void showTopscorers(List<GoalscorersDatum> goalscorers) {
        TopscorersAdapter adapter = new TopscorersAdapter(goalscorers);
        recycler.setAdapter(adapter);
    }

}
