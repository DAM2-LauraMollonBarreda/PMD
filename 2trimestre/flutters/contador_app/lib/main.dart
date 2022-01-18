import 'package:contador_app/screens/contador_screen.dart';
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
        //Para quitar el banner de debug
        debugShowCheckedModeBanner: false,
        //Llamamo a la clase HomeScren (home_screen.dart) que esta en otro fichero
        //home: HomeScreen(),
        home: ContadorScreen()
      );
  }

}