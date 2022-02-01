import 'package:fl_componentes/widgets/widgets.dart';
import 'package:flutter/material.dart';

class FormularioScreen extends StatelessWidget {

  //Necesito usar las keys
  // Las keus son usadas para mantener la referencia al widget y voy
  // a asignar una key al form
  final GlobalKey<FormState> myFormKey = GlobalKey<FormState>();

  final Map<String, String> formvalues = {
    'nombre' : 'Laura',
    'correo' : 'lmollonb@iesch.org',
    'passwd' : '123456',
    'movil' : '630830881',
  };
   
  FormularioScreen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: Text('Formulario'),
      ),
      body: SingleChildScrollView(
        
        child: Padding(
          padding: const EdgeInsets.symmetric(horizontal: 20,vertical: 10),
          child: Form(
            key: myFormKey,
            child: Column(
              children: [
                CustomInputField(formProperty: 'nombre',formValue: formvalues,hintText: 'Nombre usuario', labelText: 'Nombre', helperText: 'Introduce el nombre',sufixicon: Icons.person_add, icon: Icons.verified_user_rounded ),
                const SizedBox(height: 30,),
                 CustomInputField(formProperty: 'correo', formValue: formvalues, hintText: 'example@gmail.com', labelText: 'Correo',sufixicon: Icons.mail, teclado: TextInputType.emailAddress,),
                const SizedBox(height: 30,),
                CustomInputField(formProperty: 'passwd', formValue: formvalues,hintText: 'Contraseña del usuario', labelText: 'Contraseña',sufixicon: Icons.password,contrasena: true,),
                const SizedBox(height: 30),
                CustomInputField(formProperty: 'movil', formValue: formvalues,hintText: 'Telefono movil', labelText: 'Telefono',sufixicon: Icons.phone, teclado: TextInputType.phone,),
                const SizedBox(height: 30,),
                ElevatedButton(
                  onPressed: (){
                    //Quitar el teclado de la pantalla
                    FocusScope.of(context).requestFocus(FocusNode());

                    if (!myFormKey.currentState!.validate()){
                      print('Formulario no valido');
                      return;
                    } 
                      
                    
            
                    //print(myFormKey.currentState.validate());
                  }, 
                  child: const SizedBox(
                    width: double.infinity,
                    child: Center(
                      child: Text('Guardar'),
                    ),
                  )
                )
          
          
                
              ],
            ),
          ),
        ),
      ),
    );
  }
}

