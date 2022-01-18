import 'package:flutter/material.dart';

class Listview1Screen extends StatelessWidget {
  final opciones = ['Ferrari', 'Audi', 'Seat Panda', 'Mercedes Benz', 'Ford'];

  Listview1Screen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar:
          AppBar(title: const Text('Listado'), centerTitle: true, elevation: 0),
      body: ListView(
        children: [
          //Los tres pudnos extraen cada uno de los elementos y devuelve un nuevo elemento
          // es decir recorren la lista
          ...opciones
              .map(
                (marca) => ListTile(
                  title: Text(marca),
                  leading: const Icon(Icons.car_repair),
                  trailing: const Icon(Icons.arrow_forward_ios_outlined),
                  onTap: () {
                    print(marca);
                  }
                )
              )

        ],
      ),
    );
  }
}
