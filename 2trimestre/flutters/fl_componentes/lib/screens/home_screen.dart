import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
   
  const HomeScreen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Home screen'),),
      body: ListView(
        children: [
          ListTile(
            title: const Text('Lista tipo 1'),
            leading: const Icon(Icons.list),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'lista1'),
          ),
          const Divider(),
          ListTile(
            title: const Text('Lista tipo 2'),
            leading: const Icon(Icons.list_alt_outlined),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'lista2'),
          ),
          const Divider(),
          ListTile(
            title: const Text('Card'),
            leading: const Icon(Icons.card_giftcard),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'card'),
          ),
          const Divider(),
          ListTile(
            title: const Text('Alerta'),
            leading: const Icon(Icons.alarm),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'alerta'),
          ),
          const Divider(),
          ListTile(
            title: const Text('Formulario'),
            leading: const Icon(Icons.article),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'formulario'),
          ),
         const Divider(),
          ListTile(
            title: const Text('Navegacion'),
            leading: const Icon(Icons.navigation_outlined),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'navegacion'),
          ),
          
        ],
      )
    );
  }
}