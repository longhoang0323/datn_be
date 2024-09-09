package be.bds.bdsbes.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerUseRoom {

    public String maPhong;
    public String tenKhachHang;
    public String sdt;
    public String cccd;
    public Integer trangThaiDatPhong;

}
