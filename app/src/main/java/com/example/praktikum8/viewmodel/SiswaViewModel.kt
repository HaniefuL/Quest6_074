package com.example.praktikum8.viewmodel;

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
                statusSaatIni.copy(
                        nama = ls[0],
                        gender = ls[1],
                        alamat = ls[2]
                )
        }
    }
}
