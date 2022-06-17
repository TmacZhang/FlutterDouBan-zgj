package com.example.doubanapp;

import android.os.Bundle;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.view.FlutterMain;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    FlutterMain.startInitialization(this);
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(new FlutterEngine(this));
  }
}
