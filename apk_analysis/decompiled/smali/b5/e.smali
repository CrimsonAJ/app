.class public final Lb5/e;
.super LG4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb5/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lb5/M1;

.field public d:J

.field public e:Z

.field public f:Ljava/lang/String;

.field public final g:Lb5/t;

.field public h:J

.field public i:Lb5/t;

.field public final j:J

.field public final k:Lb5/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/support/v4/media/a;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Landroid/support/v4/media/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb5/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public constructor <init>(Lb5/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p1, Lb5/e;->a:Ljava/lang/String;

    iput-object v0, p0, Lb5/e;->a:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lb5/e;->b:Ljava/lang/String;

    iput-object v0, p0, Lb5/e;->b:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lb5/e;->c:Lb5/M1;

    iput-object v0, p0, Lb5/e;->c:Lb5/M1;

    .line 6
    iget-wide v0, p1, Lb5/e;->d:J

    iput-wide v0, p0, Lb5/e;->d:J

    .line 7
    iget-boolean v0, p1, Lb5/e;->e:Z

    iput-boolean v0, p0, Lb5/e;->e:Z

    .line 8
    iget-object v0, p1, Lb5/e;->f:Ljava/lang/String;

    iput-object v0, p0, Lb5/e;->f:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lb5/e;->g:Lb5/t;

    iput-object v0, p0, Lb5/e;->g:Lb5/t;

    .line 10
    iget-wide v0, p1, Lb5/e;->h:J

    iput-wide v0, p0, Lb5/e;->h:J

    .line 11
    iget-object v0, p1, Lb5/e;->i:Lb5/t;

    iput-object v0, p0, Lb5/e;->i:Lb5/t;

    .line 12
    iget-wide v0, p1, Lb5/e;->j:J

    iput-wide v0, p0, Lb5/e;->j:J

    .line 13
    iget-object p1, p1, Lb5/e;->k:Lb5/t;

    iput-object p1, p0, Lb5/e;->k:Lb5/t;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lb5/M1;JZLjava/lang/String;Lb5/t;JLb5/t;JLb5/t;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lb5/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lb5/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lb5/e;->c:Lb5/M1;

    iput-wide p4, p0, Lb5/e;->d:J

    iput-boolean p6, p0, Lb5/e;->e:Z

    iput-object p7, p0, Lb5/e;->f:Ljava/lang/String;

    iput-object p8, p0, Lb5/e;->g:Lb5/t;

    iput-wide p9, p0, Lb5/e;->h:J

    iput-object p11, p0, Lb5/e;->i:Lb5/t;

    iput-wide p12, p0, Lb5/e;->j:J

    iput-object p14, p0, Lb5/e;->k:Lb5/t;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Ls8/n;->R(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, Lb5/e;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    iget-object v2, p0, Lb5/e;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lb5/e;->c:Lb5/M1;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-static {p1, v2, v1, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 23
    .line 24
    .line 25
    iget-wide v3, p0, Lb5/e;->d:J

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    const/16 v5, 0x8

    .line 29
    .line 30
    invoke-static {p1, v1, v5}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lb5/e;->e:Z

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    invoke-static {p1, v3, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x7

    .line 46
    iget-object v2, p0, Lb5/e;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v1, v2}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lb5/e;->g:Lb5/t;

    .line 52
    .line 53
    invoke-static {p1, v5, v1, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lb5/e;->h:J

    .line 57
    .line 58
    const/16 v3, 0x9

    .line 59
    .line 60
    invoke-static {p1, v3, v5}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    iget-object v2, p0, Lb5/e;->i:Lb5/t;

    .line 69
    .line 70
    invoke-static {p1, v1, v2, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-static {p1, v1, v5}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 76
    .line 77
    .line 78
    iget-wide v1, p0, Lb5/e;->j:J

    .line 79
    .line 80
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    iget-object v2, p0, Lb5/e;->k:Lb5/t;

    .line 86
    .line 87
    invoke-static {p1, v1, v2, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v0}, Ls8/n;->U(Landroid/os/Parcel;I)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method
