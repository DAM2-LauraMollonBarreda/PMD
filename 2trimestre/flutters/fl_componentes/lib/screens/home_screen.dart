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
            title: Text('Lista tipo 1'),
            leading: Icon(Icons.list),
            trailing: Icon(Icons.arrow_forward_ios_outlined),
            onTap: ()=> Navigator.pushNamed(context, 'lista1'),
          )
        ],
      )
    );
  }
}