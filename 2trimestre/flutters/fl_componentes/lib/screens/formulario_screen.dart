import 'package:flutter/material.dart';

class FormularioScreen extends StatelessWidget {
   
  const FormularioScreen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: Text('Formulario'),
      ),
      body: SingleChildScrollView(
        
        child: Padding(
          padding: const EdgeInsets.symmetric(horizontal: 20,vertical: 10),
          child: Column(
            children: [
              TextFormField(
                autofocus: true,
                textCapitalization: TextCapitalization.words,
                onChanged: (value) {
                  print('Valor: $value');
                },
                validator: (value){
                  if(value==null) return 'Este campo es requerido';
                },
                autovalidateMode: AutovalidateMode.always,
              )
            ],
          ),
        ),
      ),
    );
  }
}