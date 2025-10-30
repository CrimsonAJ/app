.class public final Lu4/j;
.super LS4/c;
.source "SourceFile"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cast/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu4/j;->f:I

    .line 1
    iput-object p1, p0, Lu4/j;->g:Ljava/lang/Object;

    .line 2
    const-string p1, "com.google.android.gms.cast.framework.ISessionProvider"

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, LS4/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lg2/e;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lu4/j;->f:I

    .line 3
    const-string v0, "com.google.android.gms.cast.framework.ICastStateListener"

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, LS4/c;-><init>(Ljava/lang/String;I)V

    .line 4
    iput-object p1, p0, Lu4/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu4/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lu4/j;->f:I

    .line 5
    iput-object p1, p0, Lu4/j;->g:Ljava/lang/Object;

    .line 6
    const-string p1, "com.google.android.gms.cast.framework.ICastConnectionController"

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, LS4/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lu4/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu4/j;->f:I

    .line 7
    iput-object p1, p0, Lu4/j;->g:Ljava/lang/Object;

    .line 8
    const-string p1, "com.google.android.gms.cast.framework.ISessionProxy"

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, LS4/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lw4/b;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lu4/j;->f:I

    .line 9
    iput-object p1, p0, Lu4/j;->g:Ljava/lang/Object;

    .line 10
    const-string p1, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher"

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, LS4/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g1(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    iget-object v6, v1, Lu4/j;->g:Ljava/lang/Object;

    .line 12
    .line 13
    const v7, 0xbdfcb8

    .line 14
    .line 15
    .line 16
    const/4 v8, 0x2

    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    iget v11, v1, Lu4/j;->f:I

    .line 20
    .line 21
    packed-switch v11, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    if-eq v0, v9, :cond_1

    .line 25
    .line 26
    if-eq v0, v8, :cond_0

    .line 27
    .line 28
    move v9, v10

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v2}, Landroid/os/Parcel;->readLong()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {v2}, Landroid/os/Parcel;->readLong()J

    .line 42
    .line 43
    .line 44
    move-result-wide v11

    .line 45
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-array v4, v8, [Ljava/lang/Long;

    .line 57
    .line 58
    aput-object v0, v4, v10

    .line 59
    .line 60
    aput-object v2, v4, v9

    .line 61
    .line 62
    check-cast v6, Lw4/b;

    .line 63
    .line 64
    invoke-static {v6, v4}, Lw4/b;->a(Lw4/b;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    .line 69
    .line 70
    :goto_0
    return v9

    .line 71
    :pswitch_0
    check-cast v6, Lu4/d;

    .line 72
    .line 73
    if-eq v0, v9, :cond_8

    .line 74
    .line 75
    if-eq v0, v8, :cond_6

    .line 76
    .line 77
    if-eq v0, v5, :cond_4

    .line 78
    .line 79
    if-eq v0, v4, :cond_3

    .line 80
    .line 81
    const/4 v2, 0x5

    .line 82
    if-eq v0, v2, :cond_2

    .line 83
    .line 84
    move v9, v10

    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_2
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_3
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v6, v0}, Lu4/d;->d(Lu4/d;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_4
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 115
    .line 116
    .line 117
    iget-object v2, v6, Lu4/d;->i:Lt4/A;

    .line 118
    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    iget v4, v2, Lt4/A;->F:I

    .line 122
    .line 123
    if-ne v4, v5, :cond_5

    .line 124
    .line 125
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    new-instance v5, Lt4/x;

    .line 130
    .line 131
    invoke-direct {v5, v2, v0}, Lt4/x;-><init>(Lt4/A;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iput-object v5, v4, LD4/n;->e:Ljava/lang/Object;

    .line 135
    .line 136
    const/16 v0, 0x20d9

    .line 137
    .line 138
    iput v0, v4, LD4/n;->d:I

    .line 139
    .line 140
    invoke-virtual {v4}, LD4/n;->f()LD4/n;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v2, v9, v0}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v4, Lt4/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 156
    .line 157
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Lt4/i;

    .line 162
    .line 163
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v6, Lu4/d;->i:Lt4/A;

    .line 167
    .line 168
    if-eqz v2, :cond_7

    .line 169
    .line 170
    iget v6, v2, Lt4/A;->F:I

    .line 171
    .line 172
    if-ne v6, v5, :cond_7

    .line 173
    .line 174
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    new-instance v6, Lb5/G1;

    .line 179
    .line 180
    invoke-direct {v6, v2, v0, v4}, Lb5/G1;-><init>(Lt4/A;Ljava/lang/String;Lt4/i;)V

    .line 181
    .line 182
    .line 183
    iput-object v6, v5, LD4/n;->e:Ljava/lang/Object;

    .line 184
    .line 185
    const/16 v0, 0x20d6

    .line 186
    .line 187
    iput v0, v5, LD4/n;->d:I

    .line 188
    .line 189
    invoke-virtual {v5}, LD4/n;->f()LD4/n;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v2, v9, v0}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v2, Lcom/google/firebase/messaging/u;

    .line 198
    .line 199
    invoke-direct {v2, v1}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v2}, Lf5/q;->k(Lf5/c;)Lf5/q;

    .line 203
    .line 204
    .line 205
    :cond_7
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_8
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 218
    .line 219
    .line 220
    iget-object v2, v6, Lu4/d;->i:Lt4/A;

    .line 221
    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    iget v6, v2, Lt4/A;->F:I

    .line 225
    .line 226
    if-ne v6, v5, :cond_9

    .line 227
    .line 228
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    new-instance v6, Lt4/w;

    .line 233
    .line 234
    invoke-direct {v6, v2, v0, v4, v10}, Lt4/w;-><init>(Lt4/A;Ljava/lang/String;Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    iput-object v6, v5, LD4/n;->e:Ljava/lang/Object;

    .line 238
    .line 239
    const/16 v0, 0x20d7

    .line 240
    .line 241
    iput v0, v5, LD4/n;->d:I

    .line 242
    .line 243
    invoke-virtual {v5}, LD4/n;->f()LD4/n;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v2, v9, v0}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v2, Li/G;

    .line 252
    .line 253
    const/16 v4, 0x11

    .line 254
    .line 255
    invoke-direct {v2, v4, v1}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, Lf5/q;->k(Lf5/c;)Lf5/q;

    .line 259
    .line 260
    .line 261
    :cond_9
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 262
    .line 263
    .line 264
    :goto_1
    return v9

    .line 265
    :pswitch_1
    check-cast v6, Lcom/google/android/gms/internal/cast/i;

    .line 266
    .line 267
    if-eq v0, v9, :cond_d

    .line 268
    .line 269
    if-eq v0, v8, :cond_c

    .line 270
    .line 271
    if-eq v0, v5, :cond_b

    .line 272
    .line 273
    if-eq v0, v4, :cond_a

    .line 274
    .line 275
    move v9, v10

    .line 276
    goto :goto_2

    .line 277
    :cond_a
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_b
    iget-object v0, v6, Lcom/google/android/gms/internal/cast/i;->b:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_c
    iget-object v0, v6, Lcom/google/android/gms/internal/cast/i;->d:Lu4/c;

    .line 294
    .line 295
    iget-boolean v0, v0, Lu4/c;->e:Z

    .line 296
    .line 297
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 298
    .line 299
    .line 300
    sget v2, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 301
    .line 302
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_d
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v13

    .line 310
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance v10, Lu4/d;

    .line 317
    .line 318
    new-instance v0, Lw4/i;

    .line 319
    .line 320
    iget-object v2, v6, Lcom/google/android/gms/internal/cast/i;->a:Landroid/content/Context;

    .line 321
    .line 322
    iget-object v14, v6, Lcom/google/android/gms/internal/cast/i;->d:Lu4/c;

    .line 323
    .line 324
    iget-object v15, v6, Lcom/google/android/gms/internal/cast/i;->e:Lcom/google/android/gms/internal/cast/t;

    .line 325
    .line 326
    invoke-direct {v0, v2, v14, v15}, Lw4/i;-><init>(Landroid/content/Context;Lu4/c;Lcom/google/android/gms/internal/cast/t;)V

    .line 327
    .line 328
    .line 329
    iget-object v11, v6, Lcom/google/android/gms/internal/cast/i;->a:Landroid/content/Context;

    .line 330
    .line 331
    iget-object v12, v6, Lcom/google/android/gms/internal/cast/i;->b:Ljava/lang/String;

    .line 332
    .line 333
    move-object/from16 v16, v0

    .line 334
    .line 335
    invoke-direct/range {v10 .. v16}, Lu4/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lu4/c;Lcom/google/android/gms/internal/cast/t;Lw4/i;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10}, Lu4/g;->c()LN4/a;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 343
    .line 344
    .line 345
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 346
    .line 347
    .line 348
    :goto_2
    return v9

    .line 349
    :pswitch_2
    check-cast v6, Lu4/g;

    .line 350
    .line 351
    packed-switch v0, :pswitch_data_1

    .line 352
    .line 353
    .line 354
    move v9, v10

    .line 355
    goto/16 :goto_9

    .line 356
    .line 357
    :pswitch_3
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 358
    .line 359
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    check-cast v0, Landroid/os/Bundle;

    .line 364
    .line 365
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 366
    .line 367
    .line 368
    check-cast v6, Lu4/d;

    .line 369
    .line 370
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-static {v0}, Lcom/google/android/gms/cast/CastDevice;->g(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-eqz v0, :cond_13

    .line 378
    .line 379
    iget-object v2, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 380
    .line 381
    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/CastDevice;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-nez v2, :cond_13

    .line 386
    .line 387
    iget-object v2, v0, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    if-nez v4, :cond_f

    .line 394
    .line 395
    iget-object v4, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 396
    .line 397
    if-eqz v4, :cond_e

    .line 398
    .line 399
    iget-object v4, v4, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v4, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-nez v2, :cond_f

    .line 406
    .line 407
    :cond_e
    move v2, v9

    .line 408
    goto :goto_3

    .line 409
    :cond_f
    move v2, v10

    .line 410
    :goto_3
    iput-object v0, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 411
    .line 412
    if-eq v9, v2, :cond_10

    .line 413
    .line 414
    const-string v4, "unchanged"

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_10
    const-string v4, "changed"

    .line 418
    .line 419
    :goto_4
    new-array v5, v8, [Ljava/lang/Object;

    .line 420
    .line 421
    aput-object v0, v5, v10

    .line 422
    .line 423
    aput-object v4, v5, v9

    .line 424
    .line 425
    const-string v0, "update to device (%s) with name %s"

    .line 426
    .line 427
    sget-object v4, Lu4/d;->m:Ly4/b;

    .line 428
    .line 429
    invoke-virtual {v4, v0, v5}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    if-eqz v2, :cond_13

    .line 433
    .line 434
    iget-object v0, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 435
    .line 436
    if-eqz v0, :cond_13

    .line 437
    .line 438
    iget-object v2, v6, Lu4/d;->h:Lw4/i;

    .line 439
    .line 440
    if-eqz v2, :cond_11

    .line 441
    .line 442
    new-array v4, v9, [Ljava/lang/Object;

    .line 443
    .line 444
    aput-object v0, v4, v10

    .line 445
    .line 446
    sget-object v5, Lw4/i;->v:Ly4/b;

    .line 447
    .line 448
    iget-object v7, v5, Ly4/b;->a:Ljava/lang/String;

    .line 449
    .line 450
    const-string v8, "update Cast device to %s"

    .line 451
    .line 452
    invoke-virtual {v5, v8, v4}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-static {v7, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    .line 458
    .line 459
    iput-object v0, v2, Lw4/i;->o:Lcom/google/android/gms/cast/CastDevice;

    .line 460
    .line 461
    invoke-virtual {v2}, Lw4/i;->c()V

    .line 462
    .line 463
    .line 464
    :cond_11
    iget-object v0, v6, Lu4/d;->d:Ljava/util/HashSet;

    .line 465
    .line 466
    new-instance v2, Ljava/util/HashSet;

    .line 467
    .line 468
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_12

    .line 480
    .line 481
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Lu4/D;

    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    goto :goto_5

    .line 491
    :cond_12
    iget-object v0, v6, Lu4/d;->l:Lcom/google/android/gms/internal/cast/H1;

    .line 492
    .line 493
    if-eqz v0, :cond_13

    .line 494
    .line 495
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/H1;->a:LY2/r;

    .line 496
    .line 497
    invoke-virtual {v0}, LY2/r;->X()Lcom/google/android/gms/internal/cast/i3;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    iget v2, v0, Lcom/google/android/gms/internal/cast/i3;->u:I

    .line 502
    .line 503
    add-int/2addr v2, v9

    .line 504
    iput v2, v0, Lcom/google/android/gms/internal/cast/i3;->u:I

    .line 505
    .line 506
    :cond_13
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_9

    .line 510
    .line 511
    :pswitch_4
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 512
    .line 513
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Landroid/os/Bundle;

    .line 518
    .line 519
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 520
    .line 521
    .line 522
    check-cast v6, Lu4/d;

    .line 523
    .line 524
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-static {v0}, Lcom/google/android/gms/cast/CastDevice;->g(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    iput-object v0, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 532
    .line 533
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_9

    .line 537
    .line 538
    :pswitch_5
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 539
    .line 540
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Landroid/os/Bundle;

    .line 545
    .line 546
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 547
    .line 548
    .line 549
    check-cast v6, Lu4/d;

    .line 550
    .line 551
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-static {v0}, Lcom/google/android/gms/cast/CastDevice;->g(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    iput-object v0, v6, Lu4/d;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 559
    .line 560
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_9

    .line 564
    .line 565
    :pswitch_6
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 569
    .line 570
    .line 571
    goto/16 :goto_9

    .line 572
    .line 573
    :pswitch_7
    check-cast v6, Lu4/d;

    .line 574
    .line 575
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-static {}, LF4/y;->d()V

    .line 579
    .line 580
    .line 581
    iget-object v0, v6, Lu4/d;->j:Lv4/h;

    .line 582
    .line 583
    if-nez v0, :cond_14

    .line 584
    .line 585
    const-wide/16 v4, 0x0

    .line 586
    .line 587
    goto :goto_6

    .line 588
    :cond_14
    invoke-virtual {v0}, Lv4/h;->f()J

    .line 589
    .line 590
    .line 591
    move-result-wide v4

    .line 592
    iget-object v0, v6, Lu4/d;->j:Lv4/h;

    .line 593
    .line 594
    invoke-virtual {v0}, Lv4/h;->a()J

    .line 595
    .line 596
    .line 597
    move-result-wide v6

    .line 598
    sub-long/2addr v4, v6

    .line 599
    :goto_6
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_9

    .line 606
    .line 607
    :pswitch_8
    sget v0, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 608
    .line 609
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_15

    .line 614
    .line 615
    move v0, v9

    .line 616
    goto :goto_7

    .line 617
    :cond_15
    move v0, v10

    .line 618
    :goto_7
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 619
    .line 620
    .line 621
    check-cast v6, Lu4/d;

    .line 622
    .line 623
    iget-object v2, v6, Lu4/d;->e:Lu4/q;

    .line 624
    .line 625
    if-eqz v2, :cond_16

    .line 626
    .line 627
    :try_start_0
    check-cast v2, Lu4/o;

    .line 628
    .line 629
    invoke-virtual {v2}, LS4/a;->Q()Landroid/os/Parcel;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v4, v10}, Landroid/os/Parcel;->writeInt(I)V

    .line 637
    .line 638
    .line 639
    const/4 v0, 0x6

    .line 640
    invoke-virtual {v2, v4, v0}, LS4/a;->g1(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    .line 642
    .line 643
    goto :goto_8

    .line 644
    :catch_0
    move-exception v0

    .line 645
    const-class v2, Lu4/q;

    .line 646
    .line 647
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    new-array v4, v8, [Ljava/lang/Object;

    .line 652
    .line 653
    const-string v5, "disconnectFromDevice"

    .line 654
    .line 655
    aput-object v5, v4, v10

    .line 656
    .line 657
    aput-object v2, v4, v9

    .line 658
    .line 659
    const-string v2, "Unable to call %s on %s."

    .line 660
    .line 661
    sget-object v5, Lu4/d;->m:Ly4/b;

    .line 662
    .line 663
    invoke-virtual {v5, v0, v2, v4}, Ly4/b;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :goto_8
    invoke-virtual {v6, v10}, Lu4/g;->a(I)V

    .line 667
    .line 668
    .line 669
    :cond_16
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 670
    .line 671
    .line 672
    goto :goto_9

    .line 673
    :pswitch_9
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 674
    .line 675
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    check-cast v0, Landroid/os/Bundle;

    .line 680
    .line 681
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 682
    .line 683
    .line 684
    check-cast v6, Lu4/d;

    .line 685
    .line 686
    invoke-virtual {v6, v0}, Lu4/d;->f(Landroid/os/Bundle;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 690
    .line 691
    .line 692
    goto :goto_9

    .line 693
    :pswitch_a
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 694
    .line 695
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    check-cast v0, Landroid/os/Bundle;

    .line 700
    .line 701
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 702
    .line 703
    .line 704
    check-cast v6, Lu4/d;

    .line 705
    .line 706
    invoke-virtual {v6, v0}, Lu4/d;->f(Landroid/os/Bundle;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 710
    .line 711
    .line 712
    goto :goto_9

    .line 713
    :pswitch_b
    new-instance v0, LN4/b;

    .line 714
    .line 715
    invoke-direct {v0, v6}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 719
    .line 720
    .line 721
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 722
    .line 723
    .line 724
    :goto_9
    return v9

    .line 725
    :pswitch_c
    check-cast v6, Lg2/e;

    .line 726
    .line 727
    if-eq v0, v9, :cond_1d

    .line 728
    .line 729
    if-eq v0, v8, :cond_18

    .line 730
    .line 731
    if-eq v0, v5, :cond_17

    .line 732
    .line 733
    move v9, v10

    .line 734
    goto :goto_c

    .line 735
    :cond_17
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 739
    .line 740
    .line 741
    goto :goto_c

    .line 742
    :cond_18
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    invoke-static {v2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    sget v2, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 753
    .line 754
    if-ne v0, v4, :cond_19

    .line 755
    .line 756
    move v2, v9

    .line 757
    goto :goto_a

    .line 758
    :cond_19
    move v2, v10

    .line 759
    :goto_a
    iget-object v4, v6, Lg2/e;->a:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 760
    .line 761
    iput-boolean v2, v4, Lcom/anilab/android/ui/player/PlayerActivity;->Y:Z

    .line 762
    .line 763
    if-ne v0, v5, :cond_1a

    .line 764
    .line 765
    invoke-virtual {v4}, Lcom/anilab/android/ui/player/PlayerActivity;->b0()Lj3/q;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    check-cast v2, LD/n;

    .line 770
    .line 771
    invoke-interface {v2, v10}, Lj3/r0;->f(Z)V

    .line 772
    .line 773
    .line 774
    :cond_1a
    iget-object v2, v4, Lcom/anilab/android/ui/player/PlayerActivity;->D:LJ1/c;

    .line 775
    .line 776
    if-eqz v2, :cond_1c

    .line 777
    .line 778
    iget-object v2, v2, LJ1/c;->E:Lcom/anilab/android/ui/views/FreakLoading;

    .line 779
    .line 780
    const-string v4, "freakLoading"

    .line 781
    .line 782
    invoke-static {v2, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    if-ne v0, v5, :cond_1b

    .line 786
    .line 787
    goto :goto_b

    .line 788
    :cond_1b
    const/16 v10, 0x8

    .line 789
    .line 790
    :goto_b
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 794
    .line 795
    .line 796
    goto :goto_c

    .line 797
    :cond_1c
    const-string v0, "binding"

    .line 798
    .line 799
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    const/4 v0, 0x0

    .line 803
    throw v0

    .line 804
    :cond_1d
    new-instance v0, LN4/b;

    .line 805
    .line 806
    invoke-direct {v0, v6}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3}, Landroid/os/Parcel;->writeNoException()V

    .line 810
    .line 811
    .line 812
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 813
    .line 814
    .line 815
    :goto_c
    return v9

    .line 816
    nop

    .line 817
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method
