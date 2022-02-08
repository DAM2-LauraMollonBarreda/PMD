import 'package:flutter/material.dart';

class HomeScreen extends StatefulWidget {
  String usu;
  String pass;
  HomeScreen(this.usu, this.pass);
  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Inicio"),
        backgroundColor: Colors.amber,
      ),
      body: Center(
        child: Text('El correo con el que has inicidado es \n' +
            widget.usu +
            "\n y la contraseña \n " +
            widget.pass),
      ),
      floatingActionButton: Row(
        //Donde se localizara el boton
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          MaterialButton(
            child: Text("VOLVER AL INICIO"),
            color: Colors.amberAccent,
            onPressed: () {
              Navigator.pushNamedAndRemoveUntil(context, 'login', (route) => false);
            },
          )
        ],
      ),
    );
  }
}
