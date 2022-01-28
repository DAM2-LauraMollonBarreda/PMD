

import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class AlertScreen extends StatelessWidget {
   
  const AlertScreen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: Text('Alertas'),
      ),
      body: Center(
        child: ElevatedButton(
          //Eliminado una vez haber hecho el tema
          style: ElevatedButton.styleFrom(
            primary: Colors.amber,
            elevation: 0,
            shape: StadiumBorder()
          ),
           onPressed: () {
            //Mostraremos la alerta dependiendo de nuestro donde se ejecuta la app
            Platform.isAndroid 
              ? mostrarAlertaAndroid(context)
              : mostrarAlertaIOS(context);
              
           },
           child: const Padding(
             padding: const EdgeInsets.symmetric(vertical: 15.0,horizontal: 20.0),
             child: Text('Mostrar alerta', style:TextStyle(fontSize: 20) ,),
           ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        backgroundColor: Colors.amber,
        onPressed: (){
          Navigator.pop(context);
        },
        child: const Icon(Icons.close),
        
      ),
    );
  }

  void mostrarAlertaAndroid(BuildContext context) {
    showDialog(
      barrierDismissible: false,
      context: context, 
      builder: (context) {
        return AlertDialog(
          elevation: 5,
          shape: RoundedRectangleBorder(borderRadius: BorderRadiusDirectional.circular(20)),
          title: const Text('Titulo'),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: const [
              Text('Este es el contenido de la columna'),
              SizedBox(height: 20,),
              FlutterLogo(size: 70,)
            ],
          ),
          actions: [
            TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: Text('Cancelar'))
          ],
        );
      },
    );

  }

  void mostrarAlertaIOS(BuildContext context) {
    showCupertinoDialog(
      barrierDismissible: true,
      context: context, 
      //Este builder pide que contruyama el Widget de la Alerta
      builder: (context){
        return CupertinoAlertDialog(
          title: Text('Titulo'),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: const [
              Text('Este es el contenido de la columna'),
              SizedBox(height: 20,),
              FlutterLogo(size: 70,)
            ],
          ),
          actions: [
            TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: Text('Cancelar')),

             TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: Text('Aceptar'))
          ],
        );
      },
    );
  }
}