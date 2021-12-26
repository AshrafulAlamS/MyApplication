package com.fooddrop.myapplication.ui.institution;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.fooddrop.myapplication.databinding.FragmentInstitutionBinding;

public class InstitutionFragment extends Fragment {

    private InstitutionViewModel institutionViewModel;
    private FragmentInstitutionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        institutionViewModel =
                new ViewModelProvider(this).get(InstitutionViewModel.class);

        binding = FragmentInstitutionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInstitution;
        institutionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}