import 'screens/screens.dart';
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Material App',
      //home: Listview2Screen(),
      //Para poner el tema de la aplicacion igual
      theme: ThemeData.light().copyWith(
        primaryColor: Colors.amberAccent,
        appBarTheme: AppBarTheme(
          elevation: 0,
          backgroundColor: Colors.amber
        )
      ),
      initialRoute: 'home',
      routes: {
        'home' : (BuildContext context)=> HomeScreen(),
        'lista1': (BuildContext context)=> Listview1Screen(),
        'lista2': (BuildContext context)=> Listview2Screen(),
        'alerta': (BuildContext context)=> AlertScreen(),
        'card': (BuildContext context)=> CardScreen(),
        
      },
    );
  }
}
