import 'package:curved_navigation_bar/curved_navigation_bar.dart';
import 'package:flutter/material.dart';

class NavigationBarScreen extends StatelessWidget {
  int _page = 0;
  GlobalKey<CurvedNavigationBarState> _bottomNavigationKey = GlobalKey();

  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      bottomNavigationBar: CurvedNavigationBar(
        key: _bottomNavigationKey,
        items:<Widget> [
          Icon(Icons.home,size: 30,),
          Icon(Icons.list,size: 30,),
          Icon(Icons.card_travel,size: 30,)
        ],
        onTap: (value) {
          
        },
      ),
      body:Container(color: Colors.amber,)
    );
  }
}
