import 'package:contador_app/screens/home_screen.dart';
import 'package:flutter/material.dart';

void main() {
  //Metodo que arranca la aplicacion
  runApp( MyApp() );
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
      //Widget madre
      return MaterialApp(
        debugShowCheckedModeBanner: false,
        home: HomeScreen(),
      );
  }

}