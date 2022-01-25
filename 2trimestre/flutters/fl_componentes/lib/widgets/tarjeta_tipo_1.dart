import 'package:flutter/material.dart';

class TarjetaTipo1 extends StatelessWidget {
  const TarjetaTipo1({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Card(
      child: Column(
        children:  [
          const ListTile(
            leading: Icon(Icons.photo_album_outlined, color: Colors.amber),
            title: Text('Soy un title'),
            subtitle: Text('Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar '),
          ),
          Padding(
            padding: const EdgeInsets.only(right: 10),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                TextButton(
                  onPressed: (){}, 
                  child: const Text('Ok'),
                ),
                TextButton(
                  onPressed: (){}, 
                  child: const Text('Cancelar'),
                ),
              ],
            ),
          )
        ],
      ),
    );
  }
}