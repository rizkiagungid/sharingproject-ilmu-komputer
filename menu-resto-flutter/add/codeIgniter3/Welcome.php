<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {
	function __construct(){
		parent::__construct();
		$this->load->model("data");
	}

	function rp($rp){
		$a=$rp;
		$b=explode(".",$a);
		$rp=$b[0];
		if(count($b)>1){
			$koma=$b[1];
		}else{
			$koma="";
		}
		$rupiah="";
		$p=strlen($rp);
		while($p>3){$rupiah=".".substr($rp,-3).$rupiah;
			$l=strlen($rp)-3;
			$rp=substr($rp,0,$l);
			$p=strlen($rp);
		}
		if($koma==""||$koma==0||$koma==00){
			$rupiah=$rp.$rupiah;
		}else{
			$rupiah=$rp.$rupiah.",".$koma;
		}
		if($rupiah==0||$rupiah=="0,00") $rupiah="";
		return $rupiah;
	}

	public function index(){
		$this->load->view('welcome_message');
	}
	public function pages($judul=''){
		if($judul=="kategoribyproduk"){
			$sData = array();
			$data=$this->data->kategoribyproduk();
			foreach($data as $rs){
				$arr_row=array();
				$arr_row['id'] = (int)$rs->idkategori;
				$arr_row['nama'] = $rs->kategori."";
				$sData[] = $arr_row;
			}
			header('Content-Type: application/json');
			echo json_encode($sData, JSON_PRETTY_PRINT);
		}else if($judul=="produkbykategori"){
			$sData = array();
			$data=$this->data->produkbykategori($this->input->get('id'));
			foreach($data as $rs){
				$arr_row=array();
				$arr_row['id'] = (int)$rs->id;
				$arr_row['idkategori'] = (int)$rs->idkategori;
				$arr_row['judul'] = $rs->judul."";
				$arr_row['harga'] = "Rp. ".$this->rp($rs->harga)."";
				$arr_row['hargax'] = $rs->harga."";
				$arr_row['thumbnail'] = $rs->thumbnail."";
				$sData[] = $arr_row;
			}
			header('Content-Type: application/json');
			echo json_encode($sData, JSON_PRETTY_PRINT);

		}
	}

}
