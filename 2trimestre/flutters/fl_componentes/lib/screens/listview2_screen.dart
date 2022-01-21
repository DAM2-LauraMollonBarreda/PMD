
import 'package:flutter/material.dart';

import 'home_screen.dart';

class Listview2Screen extends StatelessWidget {
  final opciones = ['Ferrari', 'Audi', 'Seat Panda', 'Mercedes Benz', 'Ford'];

 

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar:
          AppBar(title: const Text('Listado'), centerTitle: true, elevation: 0),
      //body: ListView.builder(    
      body: ListView.separated(
        //Pide una funcio 
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(opciones[index]),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap:(){
              //Navegacion
              // final iraHome = MaterialPageRoute(
              //   builder: ( context )=>  HomeScreen()
              // );
              // Navigator.push(context, iraHome);
              //COJE LA RUTA QUE TENEMOS MARCADA EN EL MAIN Y VA A HOME, esta opcion deja volver hacia detras
              Navigator.pushNamed(context, 'home');
              //COJE LA RUTA QUE TENEMOS MARCADA EN EL MAIN Y VA A HOME, esta opcion no deja volver hacia detras y sale de la aplicacion
              //Navigator.pushReplacementNamed(context, 'home');
              
            },
          );
        },
        //Pide una funcion que quiere que use como separador, el list builder no tiene separator
        separatorBuilder: (_ , __)=> const Divider() , 
        //Numero de elemento que tiene la lista que quiero que se muestren
        itemCount: opciones.length,
      )
    );
  }
}
