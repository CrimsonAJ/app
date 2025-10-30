.class public final LA1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA1/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LF4/g;Landroid/os/Parcel;I)V
    .locals 4

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
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {p1, v1, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, LF4/g;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {p1, v1, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 19
    .line 20
    .line 21
    iget v1, p0, LF4/g;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-static {p1, v1, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 28
    .line 29
    .line 30
    iget v1, p0, LF4/g;->c:I

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LF4/g;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v2, v1}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v3, p0, LF4/g;->e:Landroid/os/IBinder;

    .line 42
    .line 43
    invoke-static {p1, v1, v3}, Ls8/n;->H(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    iget-object v3, p0, LF4/g;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    invoke-static {p1, v1, v3, p2}, Ls8/n;->O(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    iget-object v3, p0, LF4/g;->g:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, v1, v3}, Ls8/n;->F(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    iget-object v3, p0, LF4/g;->h:Landroid/accounts/Account;

    .line 61
    .line 62
    invoke-static {p1, v1, v3, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    iget-object v3, p0, LF4/g;->i:[LB4/d;

    .line 68
    .line 69
    invoke-static {p1, v1, v3, p2}, Ls8/n;->O(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    iget-object v3, p0, LF4/g;->j:[LB4/d;

    .line 75
    .line 76
    invoke-static {p1, v1, v3, p2}, Ls8/n;->O(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 77
    .line 78
    .line 79
    const/16 p2, 0xc

    .line 80
    .line 81
    invoke-static {p1, p2, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 82
    .line 83
    .line 84
    iget-boolean p2, p0, LF4/g;->k:Z

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    const/16 p2, 0xd

    .line 90
    .line 91
    invoke-static {p1, p2, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 92
    .line 93
    .line 94
    iget p2, p0, LF4/g;->l:I

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p2, p0, LF4/g;->m:Z

    .line 100
    .line 101
    const/16 v1, 0xe

    .line 102
    .line 103
    invoke-static {p1, v1, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    const/16 p2, 0xf

    .line 110
    .line 111
    iget-object p0, p0, LF4/g;->n:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1, p2, p0}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, Ls8/n;->U(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    .line 119
    return-void
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
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LA1/a;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v2, "parcel"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, LH2/z;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v2, v3, v1}, LH2/z;-><init>(II)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :pswitch_0
    const-string v2, "parcel"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    new-instance v5, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    move v7, v6

    .line 53
    :goto_0
    if-eq v7, v4, :cond_0

    .line 54
    .line 55
    sget-object v8, LH2/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 56
    .line 57
    invoke-interface {v8, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    add-int/lit8 v7, v7, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    :cond_1
    new-instance v1, Lcom/anilab/domain/model/Shortcut;

    .line 75
    .line 76
    invoke-direct {v1, v2, v3, v5, v6}, Lcom/anilab/domain/model/Shortcut;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :pswitch_1
    const-string v2, "parcel"

    .line 81
    .line 82
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, LH2/s;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 100
    .line 101
    .line 102
    move-result-wide v7

    .line 103
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-direct/range {v3 .. v11}, LH2/s;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    return-object v3

    .line 115
    :pswitch_2
    const-string v2, "parcel"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v3}, LJ2/c;->valueOf(Ljava/lang/String;)LJ2/c;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    new-instance v6, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    :goto_1
    if-eq v7, v5, :cond_2

    .line 147
    .line 148
    sget-object v8, LI2/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 149
    .line 150
    invoke-interface {v8, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v7, v7, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    new-instance v1, Lcom/anilab/domain/model/MovieDownload;

    .line 161
    .line 162
    invoke-direct {v1, v2, v3, v4, v6}, Lcom/anilab/domain/model/MovieDownload;-><init>(Ljava/lang/String;LJ2/c;Ljava/lang/String;Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    return-object v1

    .line 166
    :pswitch_3
    const-string v2, "parcel"

    .line 167
    .line 168
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2}, LJ2/b;->valueOf(Ljava/lang/String;)LJ2/b;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 220
    .line 221
    .line 222
    move-result v16

    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 224
    .line 225
    .line 226
    move-result-wide v17

    .line 227
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 228
    .line 229
    .line 230
    move-result-wide v19

    .line 231
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    new-instance v3, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    move/from16 v0, v21

    .line 243
    .line 244
    :goto_2
    if-eq v0, v2, :cond_3

    .line 245
    .line 246
    move/from16 v22, v0

    .line 247
    .line 248
    sget-object v0, Lcom/anilab/domain/model/Genre;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 249
    .line 250
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    add-int/lit8 v0, v22, 0x1

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_4

    .line 265
    .line 266
    const/16 v22, 0x1

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_4
    move/from16 v22, v21

    .line 270
    .line 271
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    new-instance v2, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 278
    .line 279
    .line 280
    move-object/from16 v24, v3

    .line 281
    .line 282
    move/from16 v3, v21

    .line 283
    .line 284
    :goto_4
    if-eq v3, v0, :cond_5

    .line 285
    .line 286
    move/from16 v25, v0

    .line 287
    .line 288
    sget-object v0, LH2/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 289
    .line 290
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    add-int/lit8 v3, v3, 0x1

    .line 298
    .line 299
    move/from16 v0, v25

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 303
    .line 304
    .line 305
    move-result-wide v25

    .line 306
    move/from16 v0, v21

    .line 307
    .line 308
    move-object/from16 v21, v24

    .line 309
    .line 310
    move-wide/from16 v24, v25

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v26

    .line 316
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v27

    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_6

    .line 325
    .line 326
    const/16 v28, 0x1

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_6
    move/from16 v28, v0

    .line 330
    .line 331
    :goto_5
    new-instance v3, Lcom/anilab/domain/model/Movie;

    .line 332
    .line 333
    move-object/from16 v23, v2

    .line 334
    .line 335
    invoke-direct/range {v3 .. v28}, Lcom/anilab/domain/model/Movie;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILJ2/b;Ljava/lang/String;IIIDJLjava/util/List;ZLjava/util/List;DLjava/lang/String;Ljava/lang/String;Z)V

    .line 336
    .line 337
    .line 338
    return-object v3

    .line 339
    :pswitch_4
    const-string v0, "parcel"

    .line 340
    .line 341
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    move-object v0, v1

    .line 345
    new-instance v1, Lcom/anilab/domain/model/LatestVersion;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_7

    .line 368
    .line 369
    const/4 v0, 0x1

    .line 370
    :goto_6
    move v6, v0

    .line 371
    goto :goto_7

    .line 372
    :cond_7
    const/4 v0, 0x0

    .line 373
    goto :goto_6

    .line 374
    :goto_7
    invoke-direct/range {v1 .. v6}, Lcom/anilab/domain/model/LatestVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 375
    .line 376
    .line 377
    return-object v1

    .line 378
    :pswitch_5
    move-object v0, v1

    .line 379
    const-string v1, "parcel"

    .line 380
    .line 381
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    new-instance v2, Lcom/anilab/domain/model/Genre;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 387
    .line 388
    .line 389
    move-result-wide v3

    .line 390
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_8

    .line 403
    .line 404
    const/4 v0, 0x1

    .line 405
    :goto_8
    move v7, v0

    .line 406
    goto :goto_9

    .line 407
    :cond_8
    const/4 v0, 0x0

    .line 408
    goto :goto_8

    .line 409
    :goto_9
    invoke-direct/range {v2 .. v7}, Lcom/anilab/domain/model/Genre;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    .line 410
    .line 411
    .line 412
    return-object v2

    .line 413
    :pswitch_6
    move-object v0, v1

    .line 414
    const-string v1, "parcel"

    .line 415
    .line 416
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    new-instance v1, Lcom/anilab/domain/model/FilterConfig;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-direct {v1, v2, v0}, Lcom/anilab/domain/model/FilterConfig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return-object v1

    .line 433
    :pswitch_7
    move-object v0, v1

    .line 434
    const-string v1, "parcel"

    .line 435
    .line 436
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    new-instance v1, LH2/j;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-direct {v1, v2, v0}, LH2/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-object v1

    .line 453
    :pswitch_8
    move-object v0, v1

    .line 454
    new-instance v1, LG3/b;

    .line 455
    .line 456
    invoke-direct {v1, v0}, LG3/b;-><init>(Landroid/os/Parcel;)V

    .line 457
    .line 458
    .line 459
    return-object v1

    .line 460
    :pswitch_9
    move-object v0, v1

    .line 461
    new-instance v1, LG3/a;

    .line 462
    .line 463
    invoke-direct {v1, v0}, LG3/a;-><init>(Landroid/os/Parcel;)V

    .line 464
    .line 465
    .line 466
    return-object v1

    .line 467
    :pswitch_a
    move-object v0, v1

    .line 468
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    sget-object v2, LF4/g;->o:[Lcom/google/android/gms/common/api/Scope;

    .line 473
    .line 474
    new-instance v3, Landroid/os/Bundle;

    .line 475
    .line 476
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 477
    .line 478
    .line 479
    sget-object v4, LF4/g;->p:[LB4/d;

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    const/4 v6, 0x0

    .line 483
    move-object v13, v2

    .line 484
    move-object v14, v3

    .line 485
    move-object/from16 v16, v4

    .line 486
    .line 487
    move-object/from16 v17, v16

    .line 488
    .line 489
    move-object v11, v5

    .line 490
    move-object v12, v11

    .line 491
    move-object v15, v12

    .line 492
    move-object/from16 v21, v15

    .line 493
    .line 494
    move v8, v6

    .line 495
    move v9, v8

    .line 496
    move v10, v9

    .line 497
    move/from16 v18, v10

    .line 498
    .line 499
    move/from16 v19, v18

    .line 500
    .line 501
    move/from16 v20, v19

    .line 502
    .line 503
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    if-ge v2, v1, :cond_9

    .line 508
    .line 509
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    int-to-char v3, v2

    .line 514
    packed-switch v3, :pswitch_data_1

    .line 515
    .line 516
    .line 517
    :pswitch_b
    invoke-static {v0, v2}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :pswitch_c
    invoke-static {v0, v2}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v21

    .line 525
    goto :goto_a

    .line 526
    :pswitch_d
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 527
    .line 528
    .line 529
    move-result v20

    .line 530
    goto :goto_a

    .line 531
    :pswitch_e
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 532
    .line 533
    .line 534
    move-result v19

    .line 535
    goto :goto_a

    .line 536
    :pswitch_f
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 537
    .line 538
    .line 539
    move-result v18

    .line 540
    goto :goto_a

    .line 541
    :pswitch_10
    sget-object v3, LB4/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 542
    .line 543
    invoke-static {v0, v2, v3}, Ls8/e;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    move-object/from16 v17, v2

    .line 548
    .line 549
    check-cast v17, [LB4/d;

    .line 550
    .line 551
    goto :goto_a

    .line 552
    :pswitch_11
    sget-object v3, LB4/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 553
    .line 554
    invoke-static {v0, v2, v3}, Ls8/e;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    move-object/from16 v16, v2

    .line 559
    .line 560
    check-cast v16, [LB4/d;

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :pswitch_12
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 564
    .line 565
    invoke-static {v0, v2, v3}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    move-object v15, v2

    .line 570
    check-cast v15, Landroid/accounts/Account;

    .line 571
    .line 572
    goto :goto_a

    .line 573
    :pswitch_13
    invoke-static {v0, v2}, Ls8/e;->i(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 574
    .line 575
    .line 576
    move-result-object v14

    .line 577
    goto :goto_a

    .line 578
    :pswitch_14
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 579
    .line 580
    invoke-static {v0, v2, v3}, Ls8/e;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    move-object v13, v2

    .line 585
    check-cast v13, [Lcom/google/android/gms/common/api/Scope;

    .line 586
    .line 587
    goto :goto_a

    .line 588
    :pswitch_15
    invoke-static {v0, v2}, Ls8/e;->S(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 589
    .line 590
    .line 591
    move-result-object v12

    .line 592
    goto :goto_a

    .line 593
    :pswitch_16
    invoke-static {v0, v2}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    goto :goto_a

    .line 598
    :pswitch_17
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 599
    .line 600
    .line 601
    move-result v10

    .line 602
    goto :goto_a

    .line 603
    :pswitch_18
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 604
    .line 605
    .line 606
    move-result v9

    .line 607
    goto :goto_a

    .line 608
    :pswitch_19
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    goto :goto_a

    .line 613
    :cond_9
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 614
    .line 615
    .line 616
    new-instance v7, LF4/g;

    .line 617
    .line 618
    invoke-direct/range {v7 .. v21}, LF4/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[LB4/d;[LB4/d;ZIZLjava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return-object v7

    .line 622
    :pswitch_1a
    move-object v0, v1

    .line 623
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    const/4 v2, 0x0

    .line 628
    const/4 v3, 0x0

    .line 629
    move-object v5, v2

    .line 630
    move-object v8, v5

    .line 631
    move-object v10, v8

    .line 632
    move v6, v3

    .line 633
    move v7, v6

    .line 634
    move v9, v7

    .line 635
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    if-ge v2, v1, :cond_a

    .line 640
    .line 641
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    int-to-char v3, v2

    .line 646
    packed-switch v3, :pswitch_data_2

    .line 647
    .line 648
    .line 649
    invoke-static {v0, v2}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 650
    .line 651
    .line 652
    goto :goto_b

    .line 653
    :pswitch_1b
    invoke-static {v0, v2}, Ls8/e;->k(Landroid/os/Parcel;I)[I

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    goto :goto_b

    .line 658
    :pswitch_1c
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    goto :goto_b

    .line 663
    :pswitch_1d
    invoke-static {v0, v2}, Ls8/e;->k(Landroid/os/Parcel;I)[I

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    goto :goto_b

    .line 668
    :pswitch_1e
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    goto :goto_b

    .line 673
    :pswitch_1f
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    goto :goto_b

    .line 678
    :pswitch_20
    sget-object v3, LF4/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 679
    .line 680
    invoke-static {v0, v2, v3}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    move-object v5, v2

    .line 685
    check-cast v5, LF4/l;

    .line 686
    .line 687
    goto :goto_b

    .line 688
    :cond_a
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 689
    .line 690
    .line 691
    new-instance v4, LF4/f;

    .line 692
    .line 693
    invoke-direct/range {v4 .. v10}, LF4/f;-><init>(LF4/l;ZZ[II[I)V

    .line 694
    .line 695
    .line 696
    return-object v4

    .line 697
    :pswitch_21
    move-object v0, v1

    .line 698
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    const/4 v2, 0x0

    .line 703
    const/4 v3, 0x0

    .line 704
    move-object v4, v2

    .line 705
    move v5, v3

    .line 706
    move-object v3, v4

    .line 707
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    if-ge v6, v1, :cond_f

    .line 712
    .line 713
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    int-to-char v7, v6

    .line 718
    const/4 v8, 0x1

    .line 719
    if-eq v7, v8, :cond_e

    .line 720
    .line 721
    const/4 v8, 0x2

    .line 722
    if-eq v7, v8, :cond_d

    .line 723
    .line 724
    const/4 v8, 0x3

    .line 725
    if-eq v7, v8, :cond_c

    .line 726
    .line 727
    const/4 v8, 0x4

    .line 728
    if-eq v7, v8, :cond_b

    .line 729
    .line 730
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 731
    .line 732
    .line 733
    goto :goto_c

    .line 734
    :cond_b
    sget-object v4, LF4/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 735
    .line 736
    invoke-static {v0, v6, v4}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    check-cast v4, LF4/f;

    .line 741
    .line 742
    goto :goto_c

    .line 743
    :cond_c
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    goto :goto_c

    .line 748
    :cond_d
    sget-object v3, LB4/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 749
    .line 750
    invoke-static {v0, v6, v3}, Ls8/e;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    check-cast v3, [LB4/d;

    .line 755
    .line 756
    goto :goto_c

    .line 757
    :cond_e
    invoke-static {v0, v6}, Ls8/e;->i(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    goto :goto_c

    .line 762
    :cond_f
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 763
    .line 764
    .line 765
    new-instance v0, LF4/F;

    .line 766
    .line 767
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 768
    .line 769
    .line 770
    iput-object v2, v0, LF4/F;->a:Landroid/os/Bundle;

    .line 771
    .line 772
    iput-object v3, v0, LF4/F;->b:[LB4/d;

    .line 773
    .line 774
    iput v5, v0, LF4/F;->c:I

    .line 775
    .line 776
    iput-object v4, v0, LF4/F;->d:LF4/f;

    .line 777
    .line 778
    return-object v0

    .line 779
    :pswitch_22
    move-object v0, v1

    .line 780
    new-instance v1, Lcom/google/android/gms/common/internal/BinderWrapper;

    .line 781
    .line 782
    invoke-direct {v1, v0}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/Parcel;)V

    .line 783
    .line 784
    .line 785
    return-object v1

    .line 786
    :pswitch_23
    move-object v0, v1

    .line 787
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    const/4 v2, 0x0

    .line 792
    move v4, v2

    .line 793
    move v5, v4

    .line 794
    move v6, v5

    .line 795
    move v7, v6

    .line 796
    move v8, v7

    .line 797
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-ge v2, v1, :cond_15

    .line 802
    .line 803
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    int-to-char v3, v2

    .line 808
    const/4 v9, 0x1

    .line 809
    if-eq v3, v9, :cond_14

    .line 810
    .line 811
    const/4 v9, 0x2

    .line 812
    if-eq v3, v9, :cond_13

    .line 813
    .line 814
    const/4 v9, 0x3

    .line 815
    if-eq v3, v9, :cond_12

    .line 816
    .line 817
    const/4 v9, 0x4

    .line 818
    if-eq v3, v9, :cond_11

    .line 819
    .line 820
    const/4 v9, 0x5

    .line 821
    if-eq v3, v9, :cond_10

    .line 822
    .line 823
    invoke-static {v0, v2}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 824
    .line 825
    .line 826
    goto :goto_d

    .line 827
    :cond_10
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    goto :goto_d

    .line 832
    :cond_11
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    goto :goto_d

    .line 837
    :cond_12
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 838
    .line 839
    .line 840
    move-result v8

    .line 841
    goto :goto_d

    .line 842
    :cond_13
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    goto :goto_d

    .line 847
    :cond_14
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 848
    .line 849
    .line 850
    move-result v4

    .line 851
    goto :goto_d

    .line 852
    :cond_15
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 853
    .line 854
    .line 855
    new-instance v3, LF4/l;

    .line 856
    .line 857
    invoke-direct/range {v3 .. v8}, LF4/l;-><init>(IIIZZ)V

    .line 858
    .line 859
    .line 860
    return-object v3

    .line 861
    :pswitch_24
    move-object v0, v1

    .line 862
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    const/4 v2, 0x0

    .line 867
    const/4 v3, 0x0

    .line 868
    move v5, v2

    .line 869
    move v8, v5

    .line 870
    move v9, v8

    .line 871
    move-object v6, v3

    .line 872
    move-object v7, v6

    .line 873
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    if-ge v2, v1, :cond_1b

    .line 878
    .line 879
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 880
    .line 881
    .line 882
    move-result v2

    .line 883
    int-to-char v3, v2

    .line 884
    const/4 v4, 0x1

    .line 885
    if-eq v3, v4, :cond_1a

    .line 886
    .line 887
    const/4 v4, 0x2

    .line 888
    if-eq v3, v4, :cond_19

    .line 889
    .line 890
    const/4 v4, 0x3

    .line 891
    if-eq v3, v4, :cond_18

    .line 892
    .line 893
    const/4 v4, 0x4

    .line 894
    if-eq v3, v4, :cond_17

    .line 895
    .line 896
    const/4 v4, 0x5

    .line 897
    if-eq v3, v4, :cond_16

    .line 898
    .line 899
    invoke-static {v0, v2}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 900
    .line 901
    .line 902
    goto :goto_e

    .line 903
    :cond_16
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 904
    .line 905
    .line 906
    move-result v9

    .line 907
    goto :goto_e

    .line 908
    :cond_17
    invoke-static {v0, v2}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 909
    .line 910
    .line 911
    move-result v8

    .line 912
    goto :goto_e

    .line 913
    :cond_18
    sget-object v3, LB4/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 914
    .line 915
    invoke-static {v0, v2, v3}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    move-object v7, v2

    .line 920
    check-cast v7, LB4/b;

    .line 921
    .line 922
    goto :goto_e

    .line 923
    :cond_19
    invoke-static {v0, v2}, Ls8/e;->S(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    goto :goto_e

    .line 928
    :cond_1a
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 929
    .line 930
    .line 931
    move-result v5

    .line 932
    goto :goto_e

    .line 933
    :cond_1b
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 934
    .line 935
    .line 936
    new-instance v4, LF4/r;

    .line 937
    .line 938
    invoke-direct/range {v4 .. v9}, LF4/r;-><init>(ILandroid/os/IBinder;LB4/b;ZZ)V

    .line 939
    .line 940
    .line 941
    return-object v4

    .line 942
    :pswitch_25
    move-object v0, v1

    .line 943
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 944
    .line 945
    .line 946
    move-result v1

    .line 947
    const/4 v2, 0x0

    .line 948
    const/4 v3, 0x0

    .line 949
    move v4, v3

    .line 950
    move v5, v4

    .line 951
    move-object v3, v2

    .line 952
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 953
    .line 954
    .line 955
    move-result v6

    .line 956
    if-ge v6, v1, :cond_20

    .line 957
    .line 958
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 959
    .line 960
    .line 961
    move-result v6

    .line 962
    int-to-char v7, v6

    .line 963
    const/4 v8, 0x1

    .line 964
    if-eq v7, v8, :cond_1f

    .line 965
    .line 966
    const/4 v8, 0x2

    .line 967
    if-eq v7, v8, :cond_1e

    .line 968
    .line 969
    const/4 v8, 0x3

    .line 970
    if-eq v7, v8, :cond_1d

    .line 971
    .line 972
    const/4 v8, 0x4

    .line 973
    if-eq v7, v8, :cond_1c

    .line 974
    .line 975
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 976
    .line 977
    .line 978
    goto :goto_f

    .line 979
    :cond_1c
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 980
    .line 981
    invoke-static {v0, v6, v3}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 986
    .line 987
    goto :goto_f

    .line 988
    :cond_1d
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 989
    .line 990
    .line 991
    move-result v5

    .line 992
    goto :goto_f

    .line 993
    :cond_1e
    sget-object v2, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 994
    .line 995
    invoke-static {v0, v6, v2}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    check-cast v2, Landroid/accounts/Account;

    .line 1000
    .line 1001
    goto :goto_f

    .line 1002
    :cond_1f
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    goto :goto_f

    .line 1007
    :cond_20
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v0, LF4/q;

    .line 1011
    .line 1012
    invoke-direct {v0, v4, v2, v5, v3}, LF4/q;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1013
    .line 1014
    .line 1015
    return-object v0

    .line 1016
    :pswitch_26
    move-object v0, v1

    .line 1017
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1018
    .line 1019
    .line 1020
    move-result v1

    .line 1021
    const/4 v2, -0x1

    .line 1022
    const/4 v3, 0x0

    .line 1023
    const/4 v4, 0x0

    .line 1024
    const-wide/16 v5, 0x0

    .line 1025
    .line 1026
    move/from16 v18, v2

    .line 1027
    .line 1028
    move v8, v3

    .line 1029
    move v9, v8

    .line 1030
    move v10, v9

    .line 1031
    move/from16 v17, v10

    .line 1032
    .line 1033
    move-object v15, v4

    .line 1034
    move-object/from16 v16, v15

    .line 1035
    .line 1036
    move-wide v11, v5

    .line 1037
    move-wide v13, v11

    .line 1038
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    if-ge v2, v1, :cond_21

    .line 1043
    .line 1044
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1045
    .line 1046
    .line 1047
    move-result v2

    .line 1048
    int-to-char v3, v2

    .line 1049
    packed-switch v3, :pswitch_data_3

    .line 1050
    .line 1051
    .line 1052
    invoke-static {v0, v2}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_10

    .line 1056
    :pswitch_27
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    move/from16 v18, v2

    .line 1061
    .line 1062
    goto :goto_10

    .line 1063
    :pswitch_28
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    move/from16 v17, v2

    .line 1068
    .line 1069
    goto :goto_10

    .line 1070
    :pswitch_29
    invoke-static {v0, v2}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    move-object/from16 v16, v2

    .line 1075
    .line 1076
    goto :goto_10

    .line 1077
    :pswitch_2a
    invoke-static {v0, v2}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    move-object v15, v2

    .line 1082
    goto :goto_10

    .line 1083
    :pswitch_2b
    invoke-static {v0, v2}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v2

    .line 1087
    move-wide v13, v2

    .line 1088
    goto :goto_10

    .line 1089
    :pswitch_2c
    invoke-static {v0, v2}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v2

    .line 1093
    move-wide v11, v2

    .line 1094
    goto :goto_10

    .line 1095
    :pswitch_2d
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    move v10, v2

    .line 1100
    goto :goto_10

    .line 1101
    :pswitch_2e
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1102
    .line 1103
    .line 1104
    move-result v2

    .line 1105
    move v9, v2

    .line 1106
    goto :goto_10

    .line 1107
    :pswitch_2f
    invoke-static {v0, v2}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    move v8, v2

    .line 1112
    goto :goto_10

    .line 1113
    :cond_21
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1114
    .line 1115
    .line 1116
    new-instance v7, LF4/j;

    .line 1117
    .line 1118
    invoke-direct/range {v7 .. v18}, LF4/j;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1119
    .line 1120
    .line 1121
    return-object v7

    .line 1122
    :pswitch_30
    move-object v0, v1

    .line 1123
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v1

    .line 1127
    const/4 v2, 0x0

    .line 1128
    const/4 v3, 0x0

    .line 1129
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1130
    .line 1131
    .line 1132
    move-result v4

    .line 1133
    if-ge v4, v1, :cond_24

    .line 1134
    .line 1135
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1136
    .line 1137
    .line 1138
    move-result v4

    .line 1139
    int-to-char v5, v4

    .line 1140
    const/4 v6, 0x1

    .line 1141
    if-eq v5, v6, :cond_23

    .line 1142
    .line 1143
    const/4 v6, 0x2

    .line 1144
    if-eq v5, v6, :cond_22

    .line 1145
    .line 1146
    invoke-static {v0, v4}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_11

    .line 1150
    :cond_22
    sget-object v2, LF4/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1151
    .line 1152
    invoke-static {v0, v4, v2}, Ls8/e;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    goto :goto_11

    .line 1157
    :cond_23
    invoke-static {v0, v4}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    goto :goto_11

    .line 1162
    :cond_24
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1163
    .line 1164
    .line 1165
    new-instance v0, LF4/m;

    .line 1166
    .line 1167
    invoke-direct {v0, v2, v3}, LF4/m;-><init>(Ljava/util/List;I)V

    .line 1168
    .line 1169
    .line 1170
    return-object v0

    .line 1171
    :pswitch_31
    move-object v0, v1

    .line 1172
    new-instance v1, LF3/a;

    .line 1173
    .line 1174
    invoke-direct {v1, v0}, LF3/a;-><init>(Landroid/os/Parcel;)V

    .line 1175
    .line 1176
    .line 1177
    return-object v1

    .line 1178
    :pswitch_32
    move-object v0, v1

    .line 1179
    new-instance v1, LF0/y0;

    .line 1180
    .line 1181
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1185
    .line 1186
    .line 1187
    move-result v2

    .line 1188
    iput v2, v1, LF0/y0;->a:I

    .line 1189
    .line 1190
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1191
    .line 1192
    .line 1193
    move-result v2

    .line 1194
    iput v2, v1, LF0/y0;->b:I

    .line 1195
    .line 1196
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    iput v2, v1, LF0/y0;->c:I

    .line 1201
    .line 1202
    if-lez v2, :cond_25

    .line 1203
    .line 1204
    new-array v2, v2, [I

    .line 1205
    .line 1206
    iput-object v2, v1, LF0/y0;->d:[I

    .line 1207
    .line 1208
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1209
    .line 1210
    .line 1211
    :cond_25
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    iput v2, v1, LF0/y0;->e:I

    .line 1216
    .line 1217
    if-lez v2, :cond_26

    .line 1218
    .line 1219
    new-array v2, v2, [I

    .line 1220
    .line 1221
    iput-object v2, v1, LF0/y0;->f:[I

    .line 1222
    .line 1223
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1224
    .line 1225
    .line 1226
    :cond_26
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1227
    .line 1228
    .line 1229
    move-result v2

    .line 1230
    const/4 v3, 0x0

    .line 1231
    const/4 v4, 0x1

    .line 1232
    if-ne v2, v4, :cond_27

    .line 1233
    .line 1234
    move v2, v4

    .line 1235
    goto :goto_12

    .line 1236
    :cond_27
    move v2, v3

    .line 1237
    :goto_12
    iput-boolean v2, v1, LF0/y0;->h:Z

    .line 1238
    .line 1239
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1240
    .line 1241
    .line 1242
    move-result v2

    .line 1243
    if-ne v2, v4, :cond_28

    .line 1244
    .line 1245
    move v2, v4

    .line 1246
    goto :goto_13

    .line 1247
    :cond_28
    move v2, v3

    .line 1248
    :goto_13
    iput-boolean v2, v1, LF0/y0;->i:Z

    .line 1249
    .line 1250
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    if-ne v2, v4, :cond_29

    .line 1255
    .line 1256
    move v3, v4

    .line 1257
    :cond_29
    iput-boolean v3, v1, LF0/y0;->j:Z

    .line 1258
    .line 1259
    const-class v2, LF0/x0;

    .line 1260
    .line 1261
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v2

    .line 1265
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    iput-object v0, v1, LF0/y0;->g:Ljava/util/ArrayList;

    .line 1270
    .line 1271
    return-object v1

    .line 1272
    :pswitch_33
    move-object v0, v1

    .line 1273
    new-instance v1, LF0/x0;

    .line 1274
    .line 1275
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1279
    .line 1280
    .line 1281
    move-result v2

    .line 1282
    iput v2, v1, LF0/x0;->a:I

    .line 1283
    .line 1284
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    iput v2, v1, LF0/x0;->b:I

    .line 1289
    .line 1290
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1291
    .line 1292
    .line 1293
    move-result v2

    .line 1294
    const/4 v3, 0x1

    .line 1295
    if-ne v2, v3, :cond_2a

    .line 1296
    .line 1297
    goto :goto_14

    .line 1298
    :cond_2a
    const/4 v3, 0x0

    .line 1299
    :goto_14
    iput-boolean v3, v1, LF0/x0;->d:Z

    .line 1300
    .line 1301
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1302
    .line 1303
    .line 1304
    move-result v2

    .line 1305
    if-lez v2, :cond_2b

    .line 1306
    .line 1307
    new-array v2, v2, [I

    .line 1308
    .line 1309
    iput-object v2, v1, LF0/x0;->c:[I

    .line 1310
    .line 1311
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1312
    .line 1313
    .line 1314
    :cond_2b
    return-object v1

    .line 1315
    :pswitch_34
    move-object v0, v1

    .line 1316
    new-instance v1, LF0/F;

    .line 1317
    .line 1318
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1322
    .line 1323
    .line 1324
    move-result v2

    .line 1325
    iput v2, v1, LF0/F;->a:I

    .line 1326
    .line 1327
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1328
    .line 1329
    .line 1330
    move-result v2

    .line 1331
    iput v2, v1, LF0/F;->b:I

    .line 1332
    .line 1333
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1334
    .line 1335
    .line 1336
    move-result v0

    .line 1337
    const/4 v2, 0x1

    .line 1338
    if-ne v0, v2, :cond_2c

    .line 1339
    .line 1340
    goto :goto_15

    .line 1341
    :cond_2c
    const/4 v2, 0x0

    .line 1342
    :goto_15
    iput-boolean v2, v1, LF0/F;->c:Z

    .line 1343
    .line 1344
    return-object v1

    .line 1345
    :pswitch_35
    move-object v0, v1

    .line 1346
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1347
    .line 1348
    .line 1349
    move-result v1

    .line 1350
    const/4 v2, 0x0

    .line 1351
    const/4 v3, 0x0

    .line 1352
    move v4, v2

    .line 1353
    move-object v5, v3

    .line 1354
    move v3, v4

    .line 1355
    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1356
    .line 1357
    .line 1358
    move-result v6

    .line 1359
    if-ge v6, v1, :cond_31

    .line 1360
    .line 1361
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1362
    .line 1363
    .line 1364
    move-result v6

    .line 1365
    int-to-char v7, v6

    .line 1366
    const/4 v8, 0x1

    .line 1367
    if-eq v7, v8, :cond_30

    .line 1368
    .line 1369
    const/4 v8, 0x2

    .line 1370
    if-eq v7, v8, :cond_2f

    .line 1371
    .line 1372
    const/4 v8, 0x3

    .line 1373
    if-eq v7, v8, :cond_2e

    .line 1374
    .line 1375
    const/4 v8, 0x4

    .line 1376
    if-eq v7, v8, :cond_2d

    .line 1377
    .line 1378
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1379
    .line 1380
    .line 1381
    goto :goto_16

    .line 1382
    :cond_2d
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1383
    .line 1384
    .line 1385
    move-result v4

    .line 1386
    goto :goto_16

    .line 1387
    :cond_2e
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1388
    .line 1389
    .line 1390
    move-result v3

    .line 1391
    goto :goto_16

    .line 1392
    :cond_2f
    sget-object v5, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1393
    .line 1394
    invoke-static {v0, v6, v5}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    check-cast v5, Landroid/net/Uri;

    .line 1399
    .line 1400
    goto :goto_16

    .line 1401
    :cond_30
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1402
    .line 1403
    .line 1404
    move-result v2

    .line 1405
    goto :goto_16

    .line 1406
    :cond_31
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1407
    .line 1408
    .line 1409
    new-instance v0, LE4/a;

    .line 1410
    .line 1411
    invoke-direct {v0, v2, v5, v3, v4}, LE4/a;-><init>(ILandroid/net/Uri;II)V

    .line 1412
    .line 1413
    .line 1414
    return-object v0

    .line 1415
    :pswitch_36
    move-object v0, v1

    .line 1416
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    new-instance v2, LE3/a;

    .line 1428
    .line 1429
    invoke-direct {v2, v0, v1}, LE3/a;-><init>(ILjava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    return-object v2

    .line 1433
    :pswitch_37
    move-object v0, v1

    .line 1434
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1435
    .line 1436
    .line 1437
    move-result v1

    .line 1438
    const/4 v2, 0x0

    .line 1439
    const/4 v3, 0x0

    .line 1440
    move v4, v2

    .line 1441
    move-object v5, v3

    .line 1442
    move v3, v4

    .line 1443
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1444
    .line 1445
    .line 1446
    move-result v6

    .line 1447
    if-ge v6, v1, :cond_36

    .line 1448
    .line 1449
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1450
    .line 1451
    .line 1452
    move-result v6

    .line 1453
    int-to-char v7, v6

    .line 1454
    const/4 v8, 0x1

    .line 1455
    if-eq v7, v8, :cond_35

    .line 1456
    .line 1457
    const/4 v8, 0x2

    .line 1458
    if-eq v7, v8, :cond_34

    .line 1459
    .line 1460
    const/4 v8, 0x3

    .line 1461
    if-eq v7, v8, :cond_33

    .line 1462
    .line 1463
    const/4 v8, 0x4

    .line 1464
    if-eq v7, v8, :cond_32

    .line 1465
    .line 1466
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1467
    .line 1468
    .line 1469
    goto :goto_17

    .line 1470
    :cond_32
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1471
    .line 1472
    .line 1473
    move-result v4

    .line 1474
    goto :goto_17

    .line 1475
    :cond_33
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1476
    .line 1477
    .line 1478
    move-result v3

    .line 1479
    goto :goto_17

    .line 1480
    :cond_34
    invoke-static {v0, v6}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v5

    .line 1484
    goto :goto_17

    .line 1485
    :cond_35
    invoke-static {v0, v6}, Ls8/e;->P(Landroid/os/Parcel;I)Z

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    goto :goto_17

    .line 1490
    :cond_36
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1491
    .line 1492
    .line 1493
    new-instance v0, LB4/r;

    .line 1494
    .line 1495
    invoke-direct {v0, v3, v4, v5, v2}, LB4/r;-><init>(IILjava/lang/String;Z)V

    .line 1496
    .line 1497
    .line 1498
    return-object v0

    .line 1499
    :pswitch_38
    move-object v0, v1

    .line 1500
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1501
    .line 1502
    .line 1503
    move-result v1

    .line 1504
    const-wide/16 v2, -0x1

    .line 1505
    .line 1506
    const/4 v4, 0x0

    .line 1507
    const/4 v5, 0x0

    .line 1508
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1509
    .line 1510
    .line 1511
    move-result v6

    .line 1512
    if-ge v6, v1, :cond_3a

    .line 1513
    .line 1514
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1515
    .line 1516
    .line 1517
    move-result v6

    .line 1518
    int-to-char v7, v6

    .line 1519
    const/4 v8, 0x1

    .line 1520
    if-eq v7, v8, :cond_39

    .line 1521
    .line 1522
    const/4 v8, 0x2

    .line 1523
    if-eq v7, v8, :cond_38

    .line 1524
    .line 1525
    const/4 v8, 0x3

    .line 1526
    if-eq v7, v8, :cond_37

    .line 1527
    .line 1528
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1529
    .line 1530
    .line 1531
    goto :goto_18

    .line 1532
    :cond_37
    invoke-static {v0, v6}, Ls8/e;->U(Landroid/os/Parcel;I)J

    .line 1533
    .line 1534
    .line 1535
    move-result-wide v2

    .line 1536
    goto :goto_18

    .line 1537
    :cond_38
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1538
    .line 1539
    .line 1540
    move-result v4

    .line 1541
    goto :goto_18

    .line 1542
    :cond_39
    invoke-static {v0, v6}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v5

    .line 1546
    goto :goto_18

    .line 1547
    :cond_3a
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1548
    .line 1549
    .line 1550
    new-instance v0, LB4/d;

    .line 1551
    .line 1552
    invoke-direct {v0, v2, v3, v5, v4}, LB4/d;-><init>(JLjava/lang/String;I)V

    .line 1553
    .line 1554
    .line 1555
    return-object v0

    .line 1556
    :pswitch_39
    move-object v0, v1

    .line 1557
    invoke-static {v0}, Ls8/e;->f0(Landroid/os/Parcel;)I

    .line 1558
    .line 1559
    .line 1560
    move-result v1

    .line 1561
    const/4 v2, 0x0

    .line 1562
    const/4 v3, 0x0

    .line 1563
    move v4, v3

    .line 1564
    move v5, v4

    .line 1565
    move-object v3, v2

    .line 1566
    :goto_19
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1567
    .line 1568
    .line 1569
    move-result v6

    .line 1570
    if-ge v6, v1, :cond_3f

    .line 1571
    .line 1572
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1573
    .line 1574
    .line 1575
    move-result v6

    .line 1576
    int-to-char v7, v6

    .line 1577
    const/4 v8, 0x1

    .line 1578
    if-eq v7, v8, :cond_3e

    .line 1579
    .line 1580
    const/4 v8, 0x2

    .line 1581
    if-eq v7, v8, :cond_3d

    .line 1582
    .line 1583
    const/4 v8, 0x3

    .line 1584
    if-eq v7, v8, :cond_3c

    .line 1585
    .line 1586
    const/4 v8, 0x4

    .line 1587
    if-eq v7, v8, :cond_3b

    .line 1588
    .line 1589
    invoke-static {v0, v6}, Ls8/e;->e0(Landroid/os/Parcel;I)V

    .line 1590
    .line 1591
    .line 1592
    goto :goto_19

    .line 1593
    :cond_3b
    invoke-static {v0, v6}, Ls8/e;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v3

    .line 1597
    goto :goto_19

    .line 1598
    :cond_3c
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1599
    .line 1600
    invoke-static {v0, v6, v2}, Ls8/e;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v2

    .line 1604
    check-cast v2, Landroid/app/PendingIntent;

    .line 1605
    .line 1606
    goto :goto_19

    .line 1607
    :cond_3d
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1608
    .line 1609
    .line 1610
    move-result v5

    .line 1611
    goto :goto_19

    .line 1612
    :cond_3e
    invoke-static {v0, v6}, Ls8/e;->T(Landroid/os/Parcel;I)I

    .line 1613
    .line 1614
    .line 1615
    move-result v4

    .line 1616
    goto :goto_19

    .line 1617
    :cond_3f
    invoke-static {v0, v1}, Ls8/e;->w(Landroid/os/Parcel;I)V

    .line 1618
    .line 1619
    .line 1620
    new-instance v0, LB4/b;

    .line 1621
    .line 1622
    invoke-direct {v0, v4, v5, v2, v3}, LB4/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 1623
    .line 1624
    .line 1625
    return-object v0

    .line 1626
    :pswitch_3a
    move-object v0, v1

    .line 1627
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v1

    .line 1631
    invoke-static {v1}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 1639
    .line 1640
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1641
    .line 1642
    .line 1643
    const/4 v4, 0x0

    .line 1644
    :goto_1a
    if-ge v4, v2, :cond_40

    .line 1645
    .line 1646
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v5

    .line 1650
    invoke-static {v5}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v6

    .line 1657
    invoke-static {v6}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 1658
    .line 1659
    .line 1660
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1661
    .line 1662
    .line 1663
    add-int/lit8 v4, v4, 0x1

    .line 1664
    .line 1665
    goto :goto_1a

    .line 1666
    :cond_40
    new-instance v0, LA1/b;

    .line 1667
    .line 1668
    invoke-direct {v0, v1, v3}, LA1/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1669
    .line 1670
    .line 1671
    return-object v0

    .line 1672
    nop

    .line 1673
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_1a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_b
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
    .end packed-switch
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LA1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [LH2/z;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lcom/anilab/domain/model/Shortcut;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [LH2/s;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lcom/anilab/domain/model/MovieDownload;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lcom/anilab/domain/model/Movie;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lcom/anilab/domain/model/LatestVersion;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lcom/anilab/domain/model/Genre;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lcom/anilab/domain/model/FilterConfig;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [LH2/j;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [LG3/b;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [LG3/a;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [LF4/g;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [LF4/f;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [LF4/F;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/common/internal/BinderWrapper;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [LF4/l;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [LF4/r;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [LF4/q;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [LF4/j;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [LF4/m;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [LF3/a;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [LF0/y0;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [LF0/x0;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [LF0/F;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [LE4/a;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [LE3/a;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [LB4/r;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [LB4/d;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [LB4/b;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [LA1/b;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
