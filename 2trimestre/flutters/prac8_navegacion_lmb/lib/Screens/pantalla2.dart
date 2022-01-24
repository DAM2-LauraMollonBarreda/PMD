import 'package:flutter/material.dart';

class Pantalla2Screen extends StatelessWidget {
   
  const Pantalla2Screen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      //Ajustes de la tipica barra de arriba
      appBar: AppBar(
        //Titulo
        title: const Text('Pantalla 2'),
        //Sombreado
        elevation: 15,
        //Titulo centrado
        centerTitle: true,
      ),
      floatingActionButton: Row(
        //Donde se localizara el boton
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          FloatingActionButton(
            child: const Icon(Icons.add), 
            onPressed: (){
              Navigator.pushNamed(context, 'pantalla5');
            },
          )
        ],
      ),
    );
  }
}