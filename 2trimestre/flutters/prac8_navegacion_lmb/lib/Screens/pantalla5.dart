import 'package:flutter/material.dart';

class Pantalla5Screen extends StatelessWidget {
   
  
  
  @override
  Widget build(BuildContext context) {
   return  Scaffold(
      //Ajustes de la tipica barra de arriba
      appBar: AppBar
      (
        //Titulo
        title: const Text('Pantalla 5'),
      
        //Sombreado
        elevation: 15,
        //Titulo centrado
        centerTitle: true,
      ),

      body: ListView.separated(
        itemBuilder: (context, index) {
          return ListTile(
            title: Text('Pantalla 2'),
            //Icono que sale al principio
            leading: Icon(Icons.list),
            //Icono que sale al final
            trailing: Icon(Icons.arrow_forward_ios_outlined),
            //Cuando se hace click en la lista
            onTap: (){
                Navigator.pushNamed(context, 'pantalla2');
            },
          );
        },
        //Separa cada uno de los elementos de la lista
        separatorBuilder: (_ , __)=> Divider(),
        //Numero de elemntos que tiene la lista
        itemCount: 1,
      ),
     floatingActionButton: Row(
        //Donde se localizara el boton
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          FloatingActionButton(
            child: const Icon(Icons.home), 
            onPressed: (){
             Navigator.pushReplacementNamed(context, 'pantalla1');
            },
          )
        ],
      ),
    );
  }
}