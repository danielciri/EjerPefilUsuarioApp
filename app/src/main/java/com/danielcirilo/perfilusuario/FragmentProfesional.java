package com.danielcirilo.perfilusuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentProfesional extends Fragment {
    private User user;

    public FragmentProfesional(User user) {
        this.user = user;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profesional,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView razonSocial = getView().findViewById(R.id.tvRazonSocial);
        TextView tvCif = getView().findViewById(R.id.tvCif);
        TextView tvDireccion = getView().findViewById(R.id.tvDirecc);
        TextView tvWeb = getView().findViewById(R.id.tvPaginaWEb);
        TextView tvEmail = getView().findViewById(R.id.tvEmail);
        tvCif.setText(user.getCif());
        tvDireccion.setText(user.getDireccion());
        tvWeb.setText(user.getPaginaWeb());
        tvEmail.setText(user.getEmail());
        razonSocial.setText(user.getRazonSocial());
    }
}
