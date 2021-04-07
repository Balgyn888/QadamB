package com.example.qadam10;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogFragment extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Принцип Эйзенхауэра")
                .setMessage("Квадрант (важно и срочно) - записываются наиболее важные и срочные задачи." +
                        "Квадрант (важно и не срочно) - важные дела, которые не требуют сверхсрочности." +
                        "Квадрант (не важно и срочно) - входят те дела, которые не приближают к заветной цели, а, наоборот, тормозят события, откладывают выполнение действительно важных задач. "+
                        "Квадрант (не важно и не срочно) - Эти задачи скорее можно назвать не проблемами, а приятными заботами, которые притом не приносят абсолютно никакой рациональной пользы."
                  )
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
