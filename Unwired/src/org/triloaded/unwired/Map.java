package org.triloaded.unwired;

import com.google.android.gms.maps.GoogleMap;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends Activity implements android.location.LocationListener {
  
	private GoogleMap map;
	LocationManager locationManager ;
	android.location.Location mylocation;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		
		Toast.makeText(getApplication(), "Map works only with Network turned on !", Toast.LENGTH_SHORT).show();
    
		locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

		LatLng pl = new LatLng(11.322115339795616,75.93397255924697);
	
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
		Marker RequestedLocation = map.addMarker(new MarkerOptions().position(pl).title("Team Unwired"));
		RequestedLocation.showInfoWindow();
    
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(pl, 18));

	}

	@Override
	public void onLocationChanged(android.location.Location arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
	}

} 