package com.thm.mylistview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.Window;

public class SettingsDialog extends DialogFragment {
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
	    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	    // Get the layout inflater
	    LayoutInflater inflater = getActivity().getLayoutInflater();

	    // Inflate and set the layout for the dialog
	    // Pass null as the parent view because its going in the dialog layout
	    builder.setView(inflater.inflate(R.layout.dialog_settings, null))
	    // Add action buttons
	           .setPositiveButton("Save", new DialogInterface.OnClickListener() {
	               @Override
	               public void onClick(DialogInterface dialog, int id) {
	                   // sign in the user ...
	               }
	           })
	           .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	                   SettingsDialog.this.getDialog().cancel();
	               }
	           });      
	    return builder.create();
	}

}
