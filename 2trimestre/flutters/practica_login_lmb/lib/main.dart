import 'package:flutter/material.dart';
import 'package:practica_login_lmb/Screens/home.dart';
import 'package:practica_login_lmb/Screens/login.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    initialRoute: 'login',
    routes: {
      'login': (BuildContext context) => LoginScreen(),

    },
  ));
}