.class public final synthetic LB2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB2/i;->a:I

    iput-object p2, p0, LB2/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "https://base.url"

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    sget-object v3, LA7/n;->a:LA7/n;

    .line 8
    .line 9
    const v4, 0x7f140180

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    const/16 v6, 0xf

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v9, v1, LB2/i;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iget v10, v1, LB2/i;->a:I

    .line 20
    .line 21
    packed-switch v10, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v2, Li8/c;

    .line 30
    .line 31
    check-cast v9, Lu1/d;

    .line 32
    .line 33
    iget-object v3, v9, Lu1/d;->a:Lu1/m;

    .line 34
    .line 35
    invoke-virtual {v3}, Lu1/m;->d()Lx8/i;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v2, v4}, Li8/c;-><init>(Lx8/I;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iput-boolean v8, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 47
    .line 48
    new-instance v6, Lx8/z;

    .line 49
    .line 50
    invoke-direct {v6, v4}, Lx8/z;-><init>(Lx8/i;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v6}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v10, Lx8/f;

    .line 58
    .line 59
    invoke-direct {v10, v6, v8}, Lx8/f;-><init>(Lx8/i;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v10, v7, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    iget-object v6, v2, Li8/c;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, Ljava/lang/Exception;

    .line 68
    .line 69
    if-nez v6, :cond_2c

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    iput-boolean v6, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 73
    .line 74
    sget-object v10, Lu1/j;->a:Landroid/graphics/Paint;

    .line 75
    .line 76
    iget-object v10, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 77
    .line 78
    sget-object v11, Lu1/k;->a:Ljava/util/Set;

    .line 79
    .line 80
    iget-object v11, v9, Lu1/d;->d:Lu1/i;

    .line 81
    .line 82
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const/16 v12, 0x10e

    .line 87
    .line 88
    const/16 v13, 0x5a

    .line 89
    .line 90
    if-eqz v11, :cond_5

    .line 91
    .line 92
    if-eq v11, v8, :cond_1

    .line 93
    .line 94
    if-ne v11, v5, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    new-instance v0, LA7/b;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_1
    if-eqz v10, :cond_5

    .line 104
    .line 105
    sget-object v11, Lu1/k;->a:Ljava/util/Set;

    .line 106
    .line 107
    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_5

    .line 112
    .line 113
    :goto_0
    new-instance v10, Lg0/g;

    .line 114
    .line 115
    new-instance v11, Lu1/h;

    .line 116
    .line 117
    new-instance v14, Lx8/z;

    .line 118
    .line 119
    invoke-direct {v14, v4}, Lx8/z;-><init>(Lx8/i;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v14}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    new-instance v15, Lx8/f;

    .line 127
    .line 128
    invoke-direct {v15, v14, v8}, Lx8/f;-><init>(Lx8/i;I)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v11, v15}, Lu1/h;-><init>(Ljava/io/InputStream;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v10, v11}, Lg0/g;-><init>(Lu1/h;)V

    .line 135
    .line 136
    .line 137
    new-instance v11, Lu1/g;

    .line 138
    .line 139
    const-string v14, "Orientation"

    .line 140
    .line 141
    invoke-virtual {v10, v14}, Lg0/g;->c(Ljava/lang/String;)Lg0/c;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    if-nez v15, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    :try_start_0
    iget-object v7, v10, Lg0/g;->f:Ljava/nio/ByteOrder;

    .line 149
    .line 150
    invoke-virtual {v15, v7}, Lg0/c;->e(Ljava/nio/ByteOrder;)I

    .line 151
    .line 152
    .line 153
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    goto :goto_2

    .line 155
    :catch_0
    :goto_1
    move v7, v8

    .line 156
    :goto_2
    if-eq v7, v5, :cond_3

    .line 157
    .line 158
    const/4 v5, 0x7

    .line 159
    if-eq v7, v5, :cond_3

    .line 160
    .line 161
    const/4 v5, 0x4

    .line 162
    if-eq v7, v5, :cond_3

    .line 163
    .line 164
    const/4 v5, 0x5

    .line 165
    if-eq v7, v5, :cond_3

    .line 166
    .line 167
    move v5, v6

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    move v5, v8

    .line 170
    :goto_3
    invoke-virtual {v10, v14}, Lg0/g;->c(Ljava/lang/String;)Lg0/c;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    if-nez v7, :cond_4

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    :try_start_1
    iget-object v10, v10, Lg0/g;->f:Ljava/nio/ByteOrder;

    .line 178
    .line 179
    invoke-virtual {v7, v10}, Lg0/c;->e(Ljava/nio/ByteOrder;)I

    .line 180
    .line 181
    .line 182
    move-result v7
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 183
    goto :goto_5

    .line 184
    :catch_1
    :goto_4
    move v7, v8

    .line 185
    :goto_5
    packed-switch v7, :pswitch_data_1

    .line 186
    .line 187
    .line 188
    move v7, v6

    .line 189
    goto :goto_6

    .line 190
    :pswitch_0
    move v7, v13

    .line 191
    goto :goto_6

    .line 192
    :pswitch_1
    move v7, v12

    .line 193
    goto :goto_6

    .line 194
    :pswitch_2
    const/16 v7, 0xb4

    .line 195
    .line 196
    :goto_6
    invoke-direct {v11, v7, v5}, Lu1/g;-><init>(IZ)V

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_5
    sget-object v11, Lu1/g;->c:Lu1/g;

    .line 201
    .line 202
    :goto_7
    iget-object v5, v2, Li8/c;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v5, Ljava/lang/Exception;

    .line 205
    .line 206
    if-nez v5, :cond_2b

    .line 207
    .line 208
    iput-boolean v6, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 209
    .line 210
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 211
    .line 212
    const/16 v7, 0x1a

    .line 213
    .line 214
    iget-object v9, v9, Lu1/d;->b:LC1/m;

    .line 215
    .line 216
    if-lt v5, v7, :cond_6

    .line 217
    .line 218
    iget-object v10, v9, LC1/m;->c:Landroid/graphics/ColorSpace;

    .line 219
    .line 220
    if-eqz v10, :cond_6

    .line 221
    .line 222
    invoke-static {v0, v10}, Lcom/google/firebase/messaging/e;->u(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    iget-boolean v10, v9, LC1/m;->h:Z

    .line 226
    .line 227
    iput-boolean v10, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 228
    .line 229
    iget v10, v11, Lu1/g;->b:I

    .line 230
    .line 231
    iget-object v14, v9, LC1/m;->b:Landroid/graphics/Bitmap$Config;

    .line 232
    .line 233
    iget-boolean v11, v11, Lu1/g;->a:Z

    .line 234
    .line 235
    if-nez v11, :cond_7

    .line 236
    .line 237
    if-lez v10, :cond_9

    .line 238
    .line 239
    :cond_7
    if-eqz v14, :cond_8

    .line 240
    .line 241
    invoke-static {v14}, La/a;->u(Landroid/graphics/Bitmap$Config;)Z

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-eqz v15, :cond_9

    .line 246
    .line 247
    :cond_8
    sget-object v14, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 248
    .line 249
    :cond_9
    iget-boolean v15, v9, LC1/m;->g:Z

    .line 250
    .line 251
    if-eqz v15, :cond_a

    .line 252
    .line 253
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 254
    .line 255
    if-ne v14, v15, :cond_a

    .line 256
    .line 257
    iget-object v15, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 258
    .line 259
    const-string v6, "image/jpeg"

    .line 260
    .line 261
    invoke-static {v15, v6}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_a

    .line 266
    .line 267
    sget-object v14, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 268
    .line 269
    :cond_a
    if-lt v5, v7, :cond_b

    .line 270
    .line 271
    invoke-static {v0}, Lcom/google/firebase/messaging/e;->h(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-static {}, Lcom/google/firebase/messaging/e;->g()Landroid/graphics/Bitmap$Config;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    if-ne v5, v6, :cond_b

    .line 280
    .line 281
    invoke-static {}, Lcom/google/firebase/messaging/e;->B()Landroid/graphics/Bitmap$Config;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    if-eq v14, v5, :cond_b

    .line 286
    .line 287
    invoke-static {}, Lcom/google/firebase/messaging/e;->g()Landroid/graphics/Bitmap$Config;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    :cond_b
    iput-object v14, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 292
    .line 293
    invoke-virtual {v3}, Lu1/m;->a()LO4/h;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    instance-of v5, v3, Lu1/n;

    .line 298
    .line 299
    iget-object v6, v9, LC1/m;->a:Landroid/content/Context;

    .line 300
    .line 301
    iget-object v7, v9, LC1/m;->d:LD1/h;

    .line 302
    .line 303
    if-eqz v5, :cond_c

    .line 304
    .line 305
    sget-object v5, LD1/h;->c:LD1/h;

    .line 306
    .line 307
    invoke-static {v7, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_c

    .line 312
    .line 313
    iput v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 314
    .line 315
    iput-boolean v8, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 316
    .line 317
    check-cast v3, Lu1/n;

    .line 318
    .line 319
    iget v3, v3, Lu1/n;->j:I

    .line 320
    .line 321
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 322
    .line 323
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 332
    .line 333
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 334
    .line 335
    move-object v1, v6

    .line 336
    move v12, v8

    .line 337
    const/4 v3, 0x0

    .line 338
    goto/16 :goto_13

    .line 339
    .line 340
    :cond_c
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 341
    .line 342
    if-lez v3, :cond_d

    .line 343
    .line 344
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 345
    .line 346
    if-gtz v5, :cond_e

    .line 347
    .line 348
    :cond_d
    move-object v1, v6

    .line 349
    move v12, v8

    .line 350
    goto/16 :goto_12

    .line 351
    .line 352
    :cond_e
    if-eq v10, v13, :cond_10

    .line 353
    .line 354
    if-ne v10, v12, :cond_f

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_f
    move v14, v3

    .line 358
    goto :goto_9

    .line 359
    :cond_10
    :goto_8
    move v14, v5

    .line 360
    :goto_9
    if-eq v10, v13, :cond_12

    .line 361
    .line 362
    if-ne v10, v12, :cond_11

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_11
    move v3, v5

    .line 366
    :cond_12
    :goto_a
    sget-object v5, LD1/h;->c:LD1/h;

    .line 367
    .line 368
    invoke-static {v7, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v15

    .line 372
    iget-object v12, v9, LC1/m;->e:LD1/g;

    .line 373
    .line 374
    if-eqz v15, :cond_13

    .line 375
    .line 376
    move v15, v14

    .line 377
    goto :goto_b

    .line 378
    :cond_13
    iget-object v15, v7, LD1/h;->a:Ls8/n;

    .line 379
    .line 380
    invoke-static {v15, v12}, LH1/f;->e(Ls8/n;LD1/g;)I

    .line 381
    .line 382
    .line 383
    move-result v15

    .line 384
    :goto_b
    invoke-static {v7, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-eqz v5, :cond_14

    .line 389
    .line 390
    move v5, v3

    .line 391
    goto :goto_c

    .line 392
    :cond_14
    iget-object v5, v7, LD1/h;->b:Ls8/n;

    .line 393
    .line 394
    invoke-static {v5, v12}, LH1/f;->e(Ls8/n;LD1/g;)I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    :goto_c
    div-int v7, v14, v15

    .line 399
    .line 400
    invoke-static {v7}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    div-int v17, v3, v5

    .line 405
    .line 406
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    if-eqz v8, :cond_16

    .line 415
    .line 416
    const/4 v1, 0x1

    .line 417
    if-ne v8, v1, :cond_15

    .line 418
    .line 419
    invoke-static {v7, v13}, Ljava/lang/Math;->max(II)I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    goto :goto_d

    .line 424
    :cond_15
    new-instance v0, LA7/b;

    .line 425
    .line 426
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 427
    .line 428
    .line 429
    throw v0

    .line 430
    :cond_16
    const/4 v1, 0x1

    .line 431
    invoke-static {v7, v13}, Ljava/lang/Math;->min(II)I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    :goto_d
    if-ge v7, v1, :cond_17

    .line 436
    .line 437
    const/4 v7, 0x1

    .line 438
    :cond_17
    iput v7, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 439
    .line 440
    int-to-double v13, v14

    .line 441
    int-to-double v7, v7

    .line 442
    div-double/2addr v13, v7

    .line 443
    move-object v1, v6

    .line 444
    move-wide/from16 v18, v7

    .line 445
    .line 446
    int-to-double v6, v3

    .line 447
    div-double v6, v6, v18

    .line 448
    .line 449
    move-wide/from16 v18, v6

    .line 450
    .line 451
    int-to-double v6, v15

    .line 452
    move-wide/from16 v20, v6

    .line 453
    .line 454
    int-to-double v5, v5

    .line 455
    div-double v7, v20, v13

    .line 456
    .line 457
    div-double v5, v5, v18

    .line 458
    .line 459
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    if-eqz v3, :cond_19

    .line 464
    .line 465
    const/4 v12, 0x1

    .line 466
    if-ne v3, v12, :cond_18

    .line 467
    .line 468
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(DD)D

    .line 469
    .line 470
    .line 471
    move-result-wide v5

    .line 472
    goto :goto_e

    .line 473
    :cond_18
    new-instance v0, LA7/b;

    .line 474
    .line 475
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 476
    .line 477
    .line 478
    throw v0

    .line 479
    :cond_19
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 480
    .line 481
    .line 482
    move-result-wide v5

    .line 483
    :goto_e
    iget-boolean v3, v9, LC1/m;->f:Z

    .line 484
    .line 485
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 486
    .line 487
    if-eqz v3, :cond_1a

    .line 488
    .line 489
    cmpl-double v3, v5, v7

    .line 490
    .line 491
    if-lez v3, :cond_1a

    .line 492
    .line 493
    move-wide v5, v7

    .line 494
    :cond_1a
    cmpg-double v3, v5, v7

    .line 495
    .line 496
    if-nez v3, :cond_1b

    .line 497
    .line 498
    const/4 v3, 0x1

    .line 499
    :goto_f
    const/16 v17, 0x1

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_1b
    const/4 v3, 0x0

    .line 503
    goto :goto_f

    .line 504
    :goto_10
    xor-int/lit8 v9, v3, 0x1

    .line 505
    .line 506
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 507
    .line 508
    if-nez v3, :cond_1c

    .line 509
    .line 510
    cmpl-double v3, v5, v7

    .line 511
    .line 512
    const v7, 0x7fffffff

    .line 513
    .line 514
    .line 515
    if-lez v3, :cond_1d

    .line 516
    .line 517
    int-to-double v8, v7

    .line 518
    div-double/2addr v8, v5

    .line 519
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/measurement/Y1;->D(D)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 524
    .line 525
    iput v7, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 526
    .line 527
    :cond_1c
    :goto_11
    const/4 v3, 0x0

    .line 528
    const/4 v12, 0x1

    .line 529
    goto :goto_13

    .line 530
    :cond_1d
    iput v7, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 531
    .line 532
    int-to-double v7, v7

    .line 533
    mul-double/2addr v7, v5

    .line 534
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/Y1;->D(D)I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 539
    .line 540
    goto :goto_11

    .line 541
    :goto_12
    iput v12, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 542
    .line 543
    const/4 v3, 0x0

    .line 544
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 545
    .line 546
    :goto_13
    :try_start_2
    new-instance v5, Lx8/f;

    .line 547
    .line 548
    invoke-direct {v5, v4, v12}, Lx8/f;-><init>(Lx8/i;I)V

    .line 549
    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    invoke-static {v5, v6, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 553
    .line 554
    .line 555
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 556
    invoke-virtual {v4}, Lx8/C;->close()V

    .line 557
    .line 558
    .line 559
    iget-object v2, v2, Li8/c;->c:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v2, Ljava/lang/Exception;

    .line 562
    .line 563
    if-nez v2, :cond_2a

    .line 564
    .line 565
    if-eqz v5, :cond_29

    .line 566
    .line 567
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 576
    .line 577
    invoke-virtual {v5, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 578
    .line 579
    .line 580
    if-nez v11, :cond_1e

    .line 581
    .line 582
    if-lez v10, :cond_26

    .line 583
    .line 584
    :cond_1e
    new-instance v2, Landroid/graphics/Matrix;

    .line 585
    .line 586
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    int-to-float v4, v4

    .line 594
    const/high16 v6, 0x40000000    # 2.0f

    .line 595
    .line 596
    div-float/2addr v4, v6

    .line 597
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    int-to-float v7, v7

    .line 602
    div-float/2addr v7, v6

    .line 603
    if-eqz v11, :cond_1f

    .line 604
    .line 605
    const/high16 v6, -0x40800000    # -1.0f

    .line 606
    .line 607
    const/high16 v8, 0x3f800000    # 1.0f

    .line 608
    .line 609
    invoke-virtual {v2, v6, v8, v4, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 610
    .line 611
    .line 612
    :cond_1f
    if-lez v10, :cond_20

    .line 613
    .line 614
    int-to-float v6, v10

    .line 615
    invoke-virtual {v2, v6, v4, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 616
    .line 617
    .line 618
    :cond_20
    new-instance v4, Landroid/graphics/RectF;

    .line 619
    .line 620
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 621
    .line 622
    .line 623
    move-result v6

    .line 624
    int-to-float v6, v6

    .line 625
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 626
    .line 627
    .line 628
    move-result v7

    .line 629
    int-to-float v7, v7

    .line 630
    const/4 v8, 0x0

    .line 631
    invoke-direct {v4, v8, v8, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 635
    .line 636
    .line 637
    iget v6, v4, Landroid/graphics/RectF;->left:F

    .line 638
    .line 639
    cmpg-float v7, v6, v8

    .line 640
    .line 641
    if-nez v7, :cond_21

    .line 642
    .line 643
    iget v7, v4, Landroid/graphics/RectF;->top:F

    .line 644
    .line 645
    cmpg-float v7, v7, v8

    .line 646
    .line 647
    if-nez v7, :cond_21

    .line 648
    .line 649
    :goto_14
    const/16 v4, 0x5a

    .line 650
    .line 651
    goto :goto_15

    .line 652
    :cond_21
    neg-float v6, v6

    .line 653
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 654
    .line 655
    neg-float v4, v4

    .line 656
    invoke-virtual {v2, v6, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 657
    .line 658
    .line 659
    goto :goto_14

    .line 660
    :goto_15
    if-eq v10, v4, :cond_24

    .line 661
    .line 662
    const/16 v4, 0x10e

    .line 663
    .line 664
    if-ne v10, v4, :cond_22

    .line 665
    .line 666
    goto :goto_16

    .line 667
    :cond_22
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 676
    .line 677
    .line 678
    move-result-object v7

    .line 679
    if-nez v7, :cond_23

    .line 680
    .line 681
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 682
    .line 683
    :cond_23
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    goto :goto_17

    .line 688
    :cond_24
    :goto_16
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 693
    .line 694
    .line 695
    move-result v6

    .line 696
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 697
    .line 698
    .line 699
    move-result-object v7

    .line 700
    if-nez v7, :cond_25

    .line 701
    .line 702
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 703
    .line 704
    :cond_25
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    :goto_17
    new-instance v6, Landroid/graphics/Canvas;

    .line 709
    .line 710
    invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 711
    .line 712
    .line 713
    sget-object v7, Lu1/j;->a:Landroid/graphics/Paint;

    .line 714
    .line 715
    invoke-virtual {v6, v5, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 719
    .line 720
    .line 721
    move-object v5, v4

    .line 722
    :cond_26
    new-instance v2, Lu1/f;

    .line 723
    .line 724
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 729
    .line 730
    invoke-direct {v4, v1, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 731
    .line 732
    .line 733
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 734
    .line 735
    const/4 v12, 0x1

    .line 736
    if-gt v1, v12, :cond_28

    .line 737
    .line 738
    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 739
    .line 740
    if-eqz v0, :cond_27

    .line 741
    .line 742
    goto :goto_18

    .line 743
    :cond_27
    move v8, v3

    .line 744
    goto :goto_19

    .line 745
    :cond_28
    :goto_18
    const/4 v8, 0x1

    .line 746
    :goto_19
    invoke-direct {v2, v4, v8}, Lu1/f;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 747
    .line 748
    .line 749
    return-object v2

    .line 750
    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 751
    .line 752
    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 753
    .line 754
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    throw v0

    .line 758
    :cond_2a
    throw v2

    .line 759
    :catchall_0
    move-exception v0

    .line 760
    move-object v1, v0

    .line 761
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 762
    :catchall_1
    move-exception v0

    .line 763
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/measurement/D1;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 764
    .line 765
    .line 766
    throw v0

    .line 767
    :cond_2b
    throw v5

    .line 768
    :cond_2c
    throw v6

    .line 769
    :pswitch_3
    check-cast v9, Lcom/anilab/android/ui/update/UpdateFragment;

    .line 770
    .line 771
    :try_start_4
    iget-object v0, v9, Lcom/anilab/android/ui/update/UpdateFragment;->G0:Li0/o;

    .line 772
    .line 773
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 774
    .line 775
    invoke-virtual {v0, v1}, Li0/o;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 776
    .line 777
    .line 778
    goto :goto_1a

    .line 779
    :catch_2
    new-instance v0, LM1/D;

    .line 780
    .line 781
    invoke-direct {v0, v4}, LM1/D;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v9, v0}, LM1/n;->o0(LM1/E;)V

    .line 785
    .line 786
    .line 787
    :goto_1a
    return-object v3

    .line 788
    :pswitch_4
    check-cast v9, Lcom/anilab/android/ui/selectSubtitle/BottomSheetSelectSubtitle;

    .line 789
    .line 790
    :try_start_5
    new-instance v0, Landroid/content/Intent;

    .line 791
    .line 792
    const-string v1, "android.intent.action.VIEW"

    .line 793
    .line 794
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    iget-object v1, v9, Lcom/anilab/android/ui/selectSubtitle/BottomSheetSelectSubtitle;->S0:LY2/r;

    .line 798
    .line 799
    invoke-virtual {v1}, LY2/r;->getValue()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    check-cast v1, Ln2/g;

    .line 804
    .line 805
    iget-object v1, v1, Ln2/g;->g:LH2/h;

    .line 806
    .line 807
    if-eqz v1, :cond_2d

    .line 808
    .line 809
    iget-object v6, v1, LH2/h;->c:Ljava/lang/String;

    .line 810
    .line 811
    goto :goto_1b

    .line 812
    :cond_2d
    const/4 v6, 0x0

    .line 813
    :goto_1b
    if-nez v6, :cond_2e

    .line 814
    .line 815
    const-string v6, ""

    .line 816
    .line 817
    :cond_2e
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v9, v0}, Li0/v;->d0(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 825
    .line 826
    .line 827
    goto :goto_1d

    .line 828
    :catch_3
    invoke-virtual {v9}, Li0/v;->k()Li0/y;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    instance-of v1, v0, Lcom/anilab/android/ui/activity/MainActivity;

    .line 833
    .line 834
    if-eqz v1, :cond_2f

    .line 835
    .line 836
    move-object v7, v0

    .line 837
    check-cast v7, Lcom/anilab/android/ui/activity/MainActivity;

    .line 838
    .line 839
    goto :goto_1c

    .line 840
    :cond_2f
    const/4 v7, 0x0

    .line 841
    :goto_1c
    if-eqz v7, :cond_30

    .line 842
    .line 843
    new-instance v0, LM1/D;

    .line 844
    .line 845
    invoke-direct {v0, v4}, LM1/D;-><init>(I)V

    .line 846
    .line 847
    .line 848
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 849
    .line 850
    invoke-virtual {v7, v0}, Lcom/anilab/android/ui/activity/MainActivity;->Z(LM1/E;)V

    .line 851
    .line 852
    .line 853
    :cond_30
    :goto_1d
    return-object v3

    .line 854
    :pswitch_5
    check-cast v9, Li0/y;

    .line 855
    .line 856
    invoke-virtual {v9}, Ld/l;->reportFullyDrawn()V

    .line 857
    .line 858
    .line 859
    const/16 v16, 0x0

    .line 860
    .line 861
    return-object v16

    .line 862
    :pswitch_6
    check-cast v9, Lc2/l;

    .line 863
    .line 864
    invoke-virtual {v9}, Li0/v;->Y()Li0/v;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    return-object v0

    .line 869
    :pswitch_7
    new-instance v0, LX1/F;

    .line 870
    .line 871
    check-cast v9, Lcom/anilab/android/ui/home/HomeFragment;

    .line 872
    .line 873
    invoke-direct {v0, v9}, LX1/F;-><init>(Lcom/anilab/android/ui/home/HomeFragment;)V

    .line 874
    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_8
    return-object v9

    .line 878
    :pswitch_9
    check-cast v9, LR0/h;

    .line 879
    .line 880
    iget-object v0, v9, LR0/h;->b:Ljava/lang/String;

    .line 881
    .line 882
    iget-object v1, v9, LR0/h;->c:LQ0/b;

    .line 883
    .line 884
    iget-object v3, v9, LR0/h;->b:Ljava/lang/String;

    .line 885
    .line 886
    iget-object v4, v9, LR0/h;->a:Landroid/content/Context;

    .line 887
    .line 888
    if-eqz v0, :cond_31

    .line 889
    .line 890
    iget-boolean v0, v9, LR0/h;->d:Z

    .line 891
    .line 892
    if-eqz v0, :cond_31

    .line 893
    .line 894
    new-instance v0, Ljava/io/File;

    .line 895
    .line 896
    const-string v5, "context"

    .line 897
    .line 898
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    const-string v6, "getNoBackupFilesDir(...)"

    .line 906
    .line 907
    invoke-static {v5, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    invoke-direct {v0, v5, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    new-instance v3, LR0/g;

    .line 914
    .line 915
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    new-instance v5, Lb7/c;

    .line 920
    .line 921
    invoke-direct {v5, v2}, Lb7/c;-><init>(I)V

    .line 922
    .line 923
    .line 924
    invoke-direct {v3, v4, v0, v5, v1}, LR0/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lb7/c;LQ0/b;)V

    .line 925
    .line 926
    .line 927
    goto :goto_1e

    .line 928
    :cond_31
    new-instance v0, LR0/g;

    .line 929
    .line 930
    new-instance v5, Lb7/c;

    .line 931
    .line 932
    invoke-direct {v5, v2}, Lb7/c;-><init>(I)V

    .line 933
    .line 934
    .line 935
    invoke-direct {v0, v4, v3, v5, v1}, LR0/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lb7/c;LQ0/b;)V

    .line 936
    .line 937
    .line 938
    move-object v3, v0

    .line 939
    :goto_1e
    iget-boolean v0, v9, LR0/h;->f:Z

    .line 940
    .line 941
    invoke-virtual {v3, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 942
    .line 943
    .line 944
    return-object v3

    .line 945
    :pswitch_a
    new-instance v1, Lz2/a;

    .line 946
    .line 947
    const/16 v2, 0x8

    .line 948
    .line 949
    invoke-direct {v1, v2}, Lz2/a;-><init>(I)V

    .line 950
    .line 951
    .line 952
    new-instance v2, Li8/D;

    .line 953
    .line 954
    invoke-direct {v2}, Li8/D;-><init>()V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v2, v1}, Li8/D;->d(Li8/s;)V

    .line 958
    .line 959
    .line 960
    check-cast v9, LK1/g;

    .line 961
    .line 962
    iget-object v1, v9, LK1/g;->b:LA7/l;

    .line 963
    .line 964
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    check-cast v1, LK1/f;

    .line 969
    .line 970
    invoke-virtual {v2, v1}, Li8/D;->a(Li8/z;)V

    .line 971
    .line 972
    .line 973
    const/4 v12, 0x1

    .line 974
    iput-boolean v12, v2, Li8/D;->f:Z

    .line 975
    .line 976
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 977
    .line 978
    invoke-virtual {v2}, Li8/D;->c()V

    .line 979
    .line 980
    .line 981
    new-instance v1, Li8/E;

    .line 982
    .line 983
    invoke-direct {v1, v2}, Li8/E;-><init>(Li8/D;)V

    .line 984
    .line 985
    .line 986
    new-instance v2, Ll1/g;

    .line 987
    .line 988
    invoke-direct {v2, v6}, Ll1/g;-><init>(I)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2, v0}, Ll1/g;->e(Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    iput-object v1, v2, Ll1/g;->a:Ljava/lang/Object;

    .line 995
    .line 996
    invoke-virtual {v2}, Ll1/g;->g()Lz8/Q;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    const-class v1, LK1/c;

    .line 1001
    .line 1002
    invoke-virtual {v0, v1}, Lz8/Q;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    check-cast v0, LK1/c;

    .line 1007
    .line 1008
    return-object v0

    .line 1009
    :pswitch_b
    check-cast v9, LA1/g;

    .line 1010
    .line 1011
    const-string v0, ":memory:"

    .line 1012
    .line 1013
    invoke-virtual {v9, v0}, LA1/g;->g(Ljava/lang/String;)LP0/a;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    return-object v0

    .line 1018
    :pswitch_c
    check-cast v9, LG0/H;

    .line 1019
    .line 1020
    invoke-virtual {v9}, LG0/H;->b()Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    iget-object v1, v9, LG0/H;->a:Ljava/lang/Object;

    .line 1025
    .line 1026
    check-cast v1, LG0/E;

    .line 1027
    .line 1028
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v1}, LG0/E;->a()V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v1}, LG0/E;->b()V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v1}, LG0/E;->i()LQ0/d;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    invoke-interface {v1}, LQ0/d;->Z()LQ0/a;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    invoke-interface {v1, v0}, LQ0/a;->q(Ljava/lang/String;)LR0/j;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    return-object v0

    .line 1050
    :pswitch_d
    new-instance v1, Li8/D;

    .line 1051
    .line 1052
    invoke-direct {v1}, Li8/D;-><init>()V

    .line 1053
    .line 1054
    .line 1055
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1056
    .line 1057
    const-wide/16 v2, 0x3c

    .line 1058
    .line 1059
    invoke-virtual {v1, v2, v3}, Li8/D;->b(J)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1}, Li8/D;->c()V

    .line 1063
    .line 1064
    .line 1065
    const-wide/16 v2, 0x1e

    .line 1066
    .line 1067
    invoke-virtual {v1, v2, v3}, Li8/D;->e(J)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v2, LD2/a;

    .line 1071
    .line 1072
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v1, v2}, Li8/D;->a(Li8/z;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v2, LB2/e;

    .line 1079
    .line 1080
    invoke-direct {v2, v5}, LB2/e;-><init>(I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v1, v2}, Li8/D;->a(Li8/z;)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v2, Li8/E;

    .line 1087
    .line 1088
    invoke-direct {v2, v1}, Li8/E;-><init>(Li8/D;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v1, Ll1/g;

    .line 1092
    .line 1093
    invoke-direct {v1, v6}, Ll1/g;-><init>(I)V

    .line 1094
    .line 1095
    .line 1096
    iput-object v2, v1, Ll1/g;->a:Ljava/lang/Object;

    .line 1097
    .line 1098
    invoke-virtual {v1, v0}, Ll1/g;->e(Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    check-cast v9, Lo7/y;

    .line 1102
    .line 1103
    new-instance v0, LA8/a;

    .line 1104
    .line 1105
    invoke-direct {v0, v9}, LA8/a;-><init>(Lo7/y;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v1, v0}, Ll1/g;->b(LA8/a;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v1}, Ll1/g;->g()Lz8/Q;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    const-class v1, LB2/a;

    .line 1116
    .line 1117
    invoke-virtual {v0, v1}, Lz8/Q;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    check-cast v0, LB2/a;

    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :pswitch_e
    new-instance v0, Ll1/g;

    .line 1125
    .line 1126
    invoke-direct {v0, v6}, Ll1/g;-><init>(I)V

    .line 1127
    .line 1128
    .line 1129
    check-cast v9, Lb6/o;

    .line 1130
    .line 1131
    iget-object v1, v9, Lb6/o;->c:Ljava/lang/Object;

    .line 1132
    .line 1133
    check-cast v1, Ly2/a;

    .line 1134
    .line 1135
    invoke-static {v1}, LO4/h;->t(Ly2/a;)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    invoke-virtual {v0, v1}, Ll1/g;->e(Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    iget-object v1, v9, Lb6/o;->b:Ljava/lang/Object;

    .line 1143
    .line 1144
    check-cast v1, Lo7/y;

    .line 1145
    .line 1146
    new-instance v2, LA8/a;

    .line 1147
    .line 1148
    invoke-direct {v2, v1}, LA8/a;-><init>(Lo7/y;)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v0, v2}, Ll1/g;->b(LA8/a;)V

    .line 1152
    .line 1153
    .line 1154
    iget-object v1, v9, Lb6/o;->a:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v1, Li8/E;

    .line 1157
    .line 1158
    iput-object v1, v0, Ll1/g;->a:Ljava/lang/Object;

    .line 1159
    .line 1160
    invoke-virtual {v0}, Ll1/g;->g()Lz8/Q;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    const-class v1, LB2/d;

    .line 1165
    .line 1166
    invoke-virtual {v0, v1}, Lz8/Q;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    check-cast v0, LB2/d;

    .line 1171
    .line 1172
    return-object v0

    .line 1173
    :pswitch_data_0
    .packed-switch 0x0
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
    .end packed-switch

    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
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
.end method
