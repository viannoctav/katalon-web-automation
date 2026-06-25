package com.example

import com.kms.katalon.core.annotation.Keyword
import java.util.Random

public class RandomHelper {

    @Keyword
    static String randomName(int length = 6) {
        String chars = 'abcdefghijklmnopqrstuvwxyz'
        Random rand = new Random()
        return (1..length).collect { chars[rand.nextInt(chars.length())] }.join('').capitalize()
    }

    @Keyword
    static String randomEmail() {
        String prefix = randomName(8).toLowerCase()
        String suffix = randomName(4).toLowerCase()
        return "${prefix}.${suffix}@mailinator.com"
    }

    @Keyword
    static String randomPhone() {
        Random rand = new Random()
        // Format: 628XXXXXXXXX (11 digit setelah 62)
        String digits = (1..9).collect { rand.nextInt(9) + 1 }.join('')
        return "628${digits}"
    }

    @Keyword
    static String randomPostalCode() {
        Random rand = new Random()
        return (10000 + rand.nextInt(89999)).toString()
    }
	
	@Keyword
	static String randomStreet() {
		String[] streetNames = ['Mawar', 'Melati', 'Kenanga', 'Anggrek', 'Dahlia', 'Flamboyan', 'Cempaka', 'Bougenville']
		Random rand = new Random()
		String name = streetNames[rand.nextInt(streetNames.length)]
		int number = rand.nextInt(100) + 1
		return "Jl. ${name} No. ${number}"
	}
	
	@Keyword
	static Map randomCityState() {
	    def locations = [
	        [city: 'Bekasi',      state: 'Jawa Barat'],
	        [city: 'Depok',       state: 'Jawa Barat'],
	        [city: 'Bogor',       state: 'Jawa Barat'],
	        [city: 'Bandung',     state: 'Jawa Barat'],
	        [city: 'Surabaya',    state: 'Jawa Timur'],
	        [city: 'Malang',      state: 'Jawa Timur'],
	        [city: 'Semarang',    state: 'Jawa Tengah'],
	        [city: 'Yogyakarta',  state: 'DI Yogyakarta'],
	        [city: 'Medan',       state: 'Sumatera Utara'],
	        [city: 'Makassar',    state: 'Sulawesi Selatan'],
	        [city: 'Denpasar',    state: 'Bali'],
	        [city: 'Palembang',   state: 'Sumatera Selatan'],
	        [city: 'Tangerang',   state: 'Banten'],
	        [city: 'Jakarta',     state: 'DKI Jakarta']
	    ]
	    Random rand = new Random()
	    return locations[rand.nextInt(locations.size())]
	}
}