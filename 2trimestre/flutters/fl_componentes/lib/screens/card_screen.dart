
import 'package:fl_componentes/widgets/widgets.dart';
import 'package:flutter/material.dart';

class CardScreen extends StatelessWidget {
   
  const CardScreen({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Tarjetas widget'),
      ),
      body: ListView(
        //Espacios entre cada uno de los card
        padding: const EdgeInsets.all(15),
        //padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 5),
        children: [
          TarjetaTipo1(),
          SizedBox(height: 10,),
          TarjetaTipo2(
            urlImagen: 'https://learn.zoner.com/wp-content/uploads/2018/08/landscape-photography-at-every-hour-part-ii-photographing-landscapes-in-rain-or-shine.jpg',
            texto: 'Lago covadonga'
          ),
          SizedBox(height: 10,),
          TarjetaTipo2(
            urlImagen: 'https://www.blogdelfotografo.com/wp-content/uploads/2020/04/fotografo-paisajes.jpg',
          ),
          SizedBox(height: 10,),
          TarjetaTipo2(
            urlImagen: 'https://astelus.com/wp-content/viajes/Lago-Moraine-Parque-Nacional-Banff-Alberta-Canada.jpg',
            texto: 'Lago Moraine Parque Nacional',
          ),
          SizedBox(height: 10,),
          TarjetaTipo2(
            urlImagen: 'https://concepto.de/wp-content/uploads/2015/03/paisaje-800x409.jpg',
            texto: 'Lavanda',
          ),
          
   
        ],
      ),
    );
  }
}

