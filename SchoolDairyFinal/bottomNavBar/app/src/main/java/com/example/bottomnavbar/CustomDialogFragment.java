package com.example.bottomnavbar;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {

    String title;
    String message;

    public void CustomDialogFragmentt(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Назад", null)
                .create();
    }
}