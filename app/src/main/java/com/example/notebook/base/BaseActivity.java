
package com.example.notebook.base;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {

    public AppCompatActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
    }

    public void showMessage(String message,String posActionname){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton(posActionname, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    public void showMessage(String message,String posActionname,
                            DialogInterface.OnClickListener posAction
            ,boolean isCancelable){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton(posActionname,posAction);
        builder.setCancelable(isCancelable);
        builder.show();

    }
    public void showMessage(int messageId,int posActionStringId){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(messageId);
        builder.setPositiveButton(posActionStringId, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    public void showMessage(int message,int posActionname,
                            DialogInterface.OnClickListener posAction
    ,boolean isCancelable){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton(posActionname,posAction);
        builder.setCancelable(isCancelable);
        builder.show();
    }
}
