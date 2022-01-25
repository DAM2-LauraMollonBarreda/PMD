import 'package:flutter/material.dart';

class TarjetaTipo2 extends StatelessWidget {

  final String urlImagen;
  String? texto;

  TarjetaTipo2({
    Key? key, 
    required this.urlImagen, 
    this.texto
    }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Card(
      elevation: 2,
      shadowColor: Colors.amberAccent.withOpacity(0.5),
      clipBehavior: Clip.antiAlias,
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
      child: Column(
        children: [
          FadeInImage(
          image: NetworkImage(urlImagen),
          placeholder: const AssetImage('assets/jar-loading.gif'),
          width: double.infinity,
          height: 200,
          fit: BoxFit.cover,
          fadeInDuration: const  Duration(milliseconds: 3000 ),
          
          ),
          if (texto != null) 
            Container(
              alignment: AlignmentDirectional.centerEnd,
              padding: const EdgeInsets.all(10),
              child: Text(texto! ),
            ),
        ],
      ),
    );
  }
}