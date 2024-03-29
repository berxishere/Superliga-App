package com.example.soccerapp.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soccerapp.R;
import com.example.soccerapp.adapter.FixturesAdapter;
import com.example.soccerapp.app.Api;
import com.example.soccerapp.app.App;
import com.example.soccerapp.model.fixtures.FixtureDatum;
import com.example.soccerapp.model.fixtures.FixturesResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FixturesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FixturesFragment extends Fragment {

    Api api;
    RecyclerView recycler;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FixturesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FixturesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FixturesFragment newInstance(String param1, String param2) {
        FixturesFragment fragment = new FixturesFragment();
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
        View view = inflater.inflate(R.layout.fragment_fixtures, container, false);

        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        api = App.getApi();
        getFixtures();
        return view;

    }

    private void getFixtures() {
        final int roundId = 169498;
        String include = "fixtures.localTeam,fixtures.visitorTeam";

        api.getRoundWithFixtures(roundId,include).enqueue(new Callback<FixturesResult>() {
            @Override
            public void onResponse(Call<FixturesResult> call, Response<FixturesResult> response) {
                FixturesResult roundResult = response.body();
                showFixtures(roundResult.getData().getFixtures().getData());
            }

            @Override
            public void onFailure(Call<FixturesResult> call, Throwable t) {

            }
        });

    }

    private void showFixtures(List<FixtureDatum> fixtures) {
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(new FixturesAdapter(fixtures));
    }

}
