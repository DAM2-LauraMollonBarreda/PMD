import 'package:flutter/material.dart';

class CustomInputField extends StatelessWidget {
  final String? hintText;
  final String? labelText;
  final String? helperText;
  final String? countText;
  final IconData? icon;
  final IconData? sufixicon;
  final TextInputType? teclado;
  final bool contrasena;
  
  //Recibimos el nombre del input que va a modificar este valor 
  final String formProperty;
  //Propiedad que mantiene todos los valores de un formulario
  final Map<String,String> formValue;

  const CustomInputField({
    Key? key, 
    this.hintText, this.labelText, this.helperText, this.countText, this.icon, this.sufixicon, this.teclado, this.contrasena=false, required this.formProperty, required this.formValue,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      autofocus: false,
      keyboardType: teclado,
      obscureText: contrasena,
      //initialValue: 'Laura Mollon',
      textCapitalization: TextCapitalization.words,
      //Para capututar el valor que introducimos
      onChanged: (value) {
        formValue[formProperty]=value;
      },
      validator: (valor){
        if(valor==null) return 'Este campo es requerido';
        return valor.length < 3 
        ? 'Minimo de 3 letras' 
        : null;
      },
      //le decimos cuando tiene que evaluar
      autovalidateMode: AutovalidateMode.onUserInteraction,
      decoration:  InputDecoration(
        hintText: hintText,
        labelText: labelText,
        helperText: helperText,
        counterText: countText,
        suffixIcon: Icon(sufixicon),
        //prefixIcon: Icon(Icons.person_add)
        icon: icon == null ? null : Icon(icon),
        border: OutlineInputBorder(
          borderRadius:BorderRadius.only(
            bottomLeft: Radius.circular(10),
            topLeft: Radius.circular(10)
          )
        ),
      ),
    );
  }
}