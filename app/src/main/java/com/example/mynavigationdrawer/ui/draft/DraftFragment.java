package com.example.mynavigationdrawer.ui.draft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mynavigationdrawer.R;

public class DraftFragment extends Fragment {

    private DraftViewModel draftViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        draftViewModel =
                ViewModelProviders.of(this).get(DraftViewModel.class);
        View root = inflater.inflate(R.layout.fragment_draft, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        draftViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}