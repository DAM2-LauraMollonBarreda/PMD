
import 'package:flutter/material.dart';
import 'Screens/imports.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Practicatica 8-Navegacion',
      theme: ThemeData.light().copyWith(
        primaryColor: Colors.amberAccent,
        appBarTheme: AppBarTheme(
          elevation: 0,
          backgroundColor: Colors.amber
        )
      ),
      initialRoute: 'home',
      routes: {
        'pantalla1': (BuildContext context)=> Pantalla1Screen(),
        'pantalla2': (BuildContext context)=> Pantalla2Screen(),
        'pantalla3': (BuildContext context)=> Pantalla3Screen(),
        'pantalla4': (BuildContext context)=> Pantalla4Screen(),
        'pantalla5': (BuildContext context)=> Pantalla5Screen(),
        
      },
    );
  }
}
