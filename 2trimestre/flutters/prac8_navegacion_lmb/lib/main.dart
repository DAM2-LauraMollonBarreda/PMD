import 'package:flutter/material.dart';
import 'package:prac8_navegacion_lmb/Screens/imports.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //Ocultar la etiqueta de debug
      debugShowCheckedModeBanner: false,
      title: 'Practica 8-Navegacion',

      //Pantalla en la que se inicia la aplicacion
      initialRoute: 'pantalla1',
      //Declaracion de cada una de las pantallas que tenemos en nuestra aplicacion
      routes: {
        'pantalla1' : (BuildContext context)=> Pantalla1Screen(),
        'pantalla2' : (BuildContext context)=> Pantalla2Screen(),
        'pantalla3' : (BuildContext context)=> Pantalla3Screen(),
        'pantalla4' : (BuildContext context)=> Pantalla4Screen(),
        'pantalla5' : (BuildContext context)=> Pantalla5Screen(),

      },
  
    );
  }
}

