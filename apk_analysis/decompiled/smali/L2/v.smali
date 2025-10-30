.class public final LL2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly2/a;


# direct methods
.method public constructor <init>(Ly2/a;)V
    .locals 1

    .line 1
    const-string v0, "encryptedPreference"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LL2/v;->a:Ly2/a;

    .line 10
    .line 11
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a(Z)Z
    .locals 16

    .line 1
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg6/o;->W()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-static {v3}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v5}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const-string v8, ""

    .line 30
    .line 31
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    const-class v10, Ljava/lang/String;

    .line 34
    .line 35
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    move-object/from16 v13, p0

    .line 40
    .line 41
    iget-object v14, v13, LL2/v;->a:Ly2/a;

    .line 42
    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    iget-object v3, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 46
    .line 47
    check-cast v2, Ljava/lang/Float;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, Ljava/lang/Integer;

    .line 63
    .line 64
    :goto_0
    move v6, v1

    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_0
    invoke-static {v12}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    iget-object v2, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 78
    .line 79
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {v11}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    iget-object v3, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    check-cast v2, Ljava/lang/Long;

    .line 101
    .line 102
    move v6, v1

    .line 103
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v1

    .line 107
    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    move-object v2, v0

    .line 116
    check-cast v2, Ljava/lang/Integer;

    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :cond_2
    move v6, v1

    .line 121
    invoke-static {v10}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    iget-object v1, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 132
    .line 133
    check-cast v2, Ljava/lang/String;

    .line 134
    .line 135
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    move-object v2, v0

    .line 142
    check-cast v2, Ljava/lang/Integer;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 146
    .line 147
    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    .line 148
    .line 149
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_4
    invoke-static {v9}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    iget-object v1, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 164
    .line 165
    check-cast v2, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move-object v2, v0

    .line 180
    check-cast v2, Ljava/lang/Integer;

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    iget-object v1, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 184
    .line 185
    invoke-interface {v1, v0, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_9

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_6

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_6
    :try_start_0
    iget-object v1, v14, Ly2/a;->b:Lo7/y;

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1, v0}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    goto :goto_1

    .line 209
    :catchall_0
    move-exception v0

    .line 210
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    :goto_1
    instance-of v1, v0, LA7/i;

    .line 215
    .line 216
    if-eqz v1, :cond_7

    .line 217
    .line 218
    move-object v0, v7

    .line 219
    :cond_7
    if-nez v0, :cond_8

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_8
    move-object v2, v0

    .line 223
    :cond_9
    :goto_2
    check-cast v2, Ljava/lang/Number;

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-gtz v0, :cond_a

    .line 230
    .line 231
    return v6

    .line 232
    :cond_a
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 233
    .line 234
    invoke-virtual {v0}, Lg6/o;->s0()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-wide/16 v1, 0x0

    .line 239
    .line 240
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    const-class v4, Ljava/lang/Long;

    .line 245
    .line 246
    invoke-static {v4}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    invoke-static {v5}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v15, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_b

    .line 259
    .line 260
    iget-object v4, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 261
    .line 262
    check-cast v3, Ljava/lang/Float;

    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    move-object v3, v0

    .line 277
    check-cast v3, Ljava/lang/Long;

    .line 278
    .line 279
    goto/16 :goto_5

    .line 280
    .line 281
    :cond_b
    invoke-static {v12}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-virtual {v15, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_c

    .line 290
    .line 291
    iget-object v4, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 292
    .line 293
    check-cast v3, Ljava/lang/Integer;

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v3, v0

    .line 308
    check-cast v3, Ljava/lang/Long;

    .line 309
    .line 310
    goto/16 :goto_5

    .line 311
    .line 312
    :cond_c
    invoke-static {v11}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v15, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    if-eqz v5, :cond_d

    .line 321
    .line 322
    iget-object v3, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 323
    .line 324
    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 325
    .line 326
    .line 327
    move-result-wide v3

    .line 328
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    goto/16 :goto_5

    .line 333
    .line 334
    :cond_d
    invoke-static {v10}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-virtual {v15, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_f

    .line 343
    .line 344
    iget-object v4, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 345
    .line 346
    check-cast v3, Ljava/lang/String;

    .line 347
    .line 348
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-eqz v0, :cond_e

    .line 353
    .line 354
    move-object v3, v0

    .line 355
    check-cast v3, Ljava/lang/Long;

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    .line 359
    .line 360
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 361
    .line 362
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_f
    invoke-static {v9}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-virtual {v15, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-eqz v5, :cond_10

    .line 375
    .line 376
    iget-object v4, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 377
    .line 378
    check-cast v3, Ljava/lang/Boolean;

    .line 379
    .line 380
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move-object v3, v0

    .line 393
    check-cast v3, Ljava/lang/Long;

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_10
    iget-object v5, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 397
    .line 398
    invoke-interface {v5, v0, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    if-eqz v0, :cond_14

    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-nez v5, :cond_11

    .line 409
    .line 410
    goto :goto_5

    .line 411
    :cond_11
    :try_start_1
    iget-object v5, v14, Ly2/a;->b:Lo7/y;

    .line 412
    .line 413
    invoke-virtual {v5, v4}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-virtual {v4, v0}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 421
    goto :goto_3

    .line 422
    :catchall_1
    move-exception v0

    .line 423
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    :goto_3
    instance-of v4, v0, LA7/i;

    .line 428
    .line 429
    if-eqz v4, :cond_12

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_12
    move-object v7, v0

    .line 433
    :goto_4
    if-nez v7, :cond_13

    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_13
    move-object v3, v7

    .line 437
    :cond_14
    :goto_5
    check-cast v3, Ljava/lang/Number;

    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 440
    .line 441
    .line 442
    move-result-wide v3

    .line 443
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 444
    .line 445
    .line 446
    move-result-wide v7

    .line 447
    if-eqz p1, :cond_15

    .line 448
    .line 449
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 450
    .line 451
    invoke-virtual {v0}, Lg6/o;->s0()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 456
    .line 457
    .line 458
    move-result-wide v1

    .line 459
    iget-object v3, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 460
    .line 461
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 466
    .line 467
    .line 468
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 469
    .line 470
    .line 471
    return v6

    .line 472
    :cond_15
    sub-long v9, v7, v3

    .line 473
    .line 474
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 475
    .line 476
    const-wide/16 v11, 0x1e

    .line 477
    .line 478
    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 479
    .line 480
    .line 481
    move-result-wide v11

    .line 482
    cmp-long v0, v9, v11

    .line 483
    .line 484
    if-gez v0, :cond_16

    .line 485
    .line 486
    cmp-long v0, v7, v3

    .line 487
    .line 488
    if-gez v0, :cond_17

    .line 489
    .line 490
    :cond_16
    cmp-long v0, v3, v1

    .line 491
    .line 492
    if-lez v0, :cond_17

    .line 493
    .line 494
    const/4 v1, 0x1

    .line 495
    goto :goto_6

    .line 496
    :cond_17
    move v1, v6

    .line 497
    :goto_6
    if-eqz v1, :cond_18

    .line 498
    .line 499
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 500
    .line 501
    invoke-virtual {v0}, Lg6/o;->s0()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 506
    .line 507
    .line 508
    move-result-wide v2

    .line 509
    iget-object v4, v14, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 510
    .line 511
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-interface {v4, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 516
    .line 517
    .line 518
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 519
    .line 520
    .line 521
    :cond_18
    return v1
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
