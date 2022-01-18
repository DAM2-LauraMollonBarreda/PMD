import 'package:flutter/material.dart';
import 'package:mapbox_gl/mapbox_gl.dart';
//Geolocalizacion
import 'package:geolocator/geolocator.dart';

class FullMapPage extends StatefulWidget {
  @override
  _FullMapPageState createState() => _FullMapPageState();
}

class _FullMapPageState extends State<FullMapPage> {
  MapboxMapController mapController;
  final viaducto = LatLng(40.338116427315015, -1.1058540740711849);
  Position miPosicion;
  LatLng pos = LatLng(1.0, 1.0);

  String estiloSeleccionado =
      'mapbox://styles/arodriguezgim/ckkig1y2d0u6p17nuz0l0ky8e';
  final oscurostyle = 'mapbox://styles/arodriguezgim/ckkig1y2d0u6p17nuz0l0ky8e';
  final streetStyle = 'mapbox://styles/arodriguezgim/ckkig3sr30u8q17mq5yg1gzp9';

  void _onMapCreated(MapboxMapController controller) {
    mapController = controller;
    //Obtener localizacion
    _obtenerGeo();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: mapa(),
      floatingActionButton: listaBotones(),
    );
  }

//Es el Mapa de la aplicacion
  mapa() {
    return MapboxMap(
      styleString: estiloSeleccionado,
      onMapCreated: _onMapCreated,
      initialCameraPosition: CameraPosition(
        target: viaducto,
        zoom: 14,
      ),
    );
  }

//Esta es la lista de botones lateral
  listaBotones() {
    return Column(mainAxisAlignment: MainAxisAlignment.end, children: [
      //Boton para situar el mapa en mi posicion
      FloatingActionButton(
          child: Icon(Icons.map),
          onPressed: () {
            //Método que nos faltaba en clase
            mapController.moveCamera(CameraUpdate.newCameraPosition(
                CameraPosition(target: pos, zoom: 14)));
            setState(() {});
          }),

      SizedBox(height: 5),
      //Boton para disminuir el zoom
      FloatingActionButton(
          child: Icon(Icons.zoom_out),
          onPressed: () {
            mapController.animateCamera(CameraUpdate.zoomOut());
          }),
      SizedBox(height: 5),
      //Boton para aumentar el zoom
      FloatingActionButton(
          child: Icon(Icons.zoom_in),
          onPressed: () {
            mapController.animateCamera(CameraUpdate.zoomIn());
          }),
      SizedBox(height: 5),
      //Boton para cambiar el estilo
      FloatingActionButton(
        child: Icon(Icons.add_to_home_screen),
        onPressed: () {
          if (estiloSeleccionado == oscurostyle) {
            estiloSeleccionado = streetStyle;
          } else {
            estiloSeleccionado = oscurostyle;
          }
          setState(() {});
        },
      ),
    ]);
  }

  void _obtenerGeo() async {
    miPosicion = await Geolocator.getCurrentPosition(
        desiredAccuracy: LocationAccuracy.high);
    pos = LatLng(miPosicion.latitude, miPosicion.longitude);
    setState(() {});
  }
}
