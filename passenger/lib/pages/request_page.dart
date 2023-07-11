import 'package:flutter/material.dart';
import 'package:google_maps_flutter/google_maps_flutter.dart';
import 'package:rydex/components/my_button.dart';
import 'package:rydex/components/my_textfield.dart';
import 'package:rydex/components/square_tile.dart';

class RequestPage extends StatelessWidget {
  RequestPage({super.key});

  late GoogleMapController mapController;
  final LatLng _center = const LatLng(5.8143, 0.0747);
  void _onMapCreated(GoogleMapController controller) {
    mapController = controller;
  }

  @override
  Widget build(BuildContext context){
    return Scaffold(
      body: GoogleMap(
        onMapCreated: _onMapCreated,
        initialCameraPosition: CameraPosition(
          target: _center,
          zoom: 11.0,
        ),
      ),
    );
  }

}