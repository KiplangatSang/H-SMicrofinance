package com.example.hsmicrofinance.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hsmicrofinance.R;
import com.example.hsmicrofinance.databinding.FragmentBasicInvestmentHistoryBinding;


public class BasicInvestmentHistory extends Fragment {

    FragmentBasicInvestmentHistoryBinding mFragmentBasicInvestmentHistoryBinding;

    public BasicInvestmentHistory() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mFragmentBasicInvestmentHistoryBinding = FragmentBasicInvestmentHistoryBinding.inflate(inflater,container,false);
        return mFragmentBasicInvestmentHistoryBinding.getRoot();
    }
}