.class public final LL2/u;
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
    iput-object p1, p0, LL2/u;->a:Ly2/a;

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

.method public static a(LL2/u;JI)Ljava/lang/String;
    .locals 9

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, -0x1

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p3, 0x0

    .line 14
    :goto_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long v0, p1, v0

    .line 17
    .line 18
    iget-object p0, p0, LL2/u;->a:Ly2/a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-string v7, ""

    .line 32
    .line 33
    const-class v8, Ljava/lang/String;

    .line 34
    .line 35
    if-lez v0, :cond_c

    .line 36
    .line 37
    sget-object p3, Lg6/o;->a:Lg6/o;

    .line 38
    .line 39
    invoke-virtual {p3}, Lg6/o;->i0()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v6}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 58
    .line 59
    check-cast v7, Ljava/lang/Float;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-interface {p0, p3, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    move-object v7, p0

    .line 74
    check-cast v7, Ljava/lang/String;

    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 89
    .line 90
    check-cast v7, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-interface {p0, p3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    move-object v7, p0

    .line 105
    check-cast v7, Ljava/lang/String;

    .line 106
    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 120
    .line 121
    check-cast v7, Ljava/lang/Long;

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    invoke-interface {p0, p3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    move-object v7, p0

    .line 136
    check-cast v7, Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_6

    .line 148
    .line 149
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 150
    .line 151
    invoke-interface {p0, p3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    if-eqz v7, :cond_5

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 159
    .line 160
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 175
    .line 176
    check-cast v7, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-interface {p0, p3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    move-object v7, p0

    .line 191
    check-cast v7, Ljava/lang/String;

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_7
    iget-object v0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 195
    .line 196
    invoke-interface {v0, p3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    if-eqz p3, :cond_b

    .line 201
    .line 202
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_8

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_8
    :try_start_0
    iget-object p0, p0, Ly2/a;->b:Lo7/y;

    .line 210
    .line 211
    invoke-virtual {p0, v8}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0, p3}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    goto :goto_1

    .line 220
    :catchall_0
    move-exception p0

    .line 221
    invoke-static {p0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_1
    instance-of p3, p0, LA7/i;

    .line 226
    .line 227
    if-eqz p3, :cond_9

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_9
    move-object v1, p0

    .line 231
    :goto_2
    if-nez v1, :cond_a

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    move-object v7, v1

    .line 235
    :cond_b
    :goto_3
    check-cast v7, Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v7}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_24

    .line 242
    .line 243
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    const-string p1, "{anime_id}"

    .line 248
    .line 249
    invoke-static {v7, p1, p0}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    goto/16 :goto_a

    .line 254
    .line 255
    :cond_c
    if-eqz p3, :cond_18

    .line 256
    .line 257
    sget-object p1, Lg6/o;->a:Lg6/o;

    .line 258
    .line 259
    invoke-virtual {p1}, Lg6/o;->Z()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-virtual {p1}, Lg6/o;->K()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 268
    .line 269
    .line 270
    move-result-object p3

    .line 271
    invoke-static {v6}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_d

    .line 280
    .line 281
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 282
    .line 283
    check-cast p1, Ljava/lang/Float;

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    move-object p1, p0

    .line 298
    check-cast p1, Ljava/lang/String;

    .line 299
    .line 300
    goto/16 :goto_6

    .line 301
    .line 302
    :cond_d
    invoke-static {v5}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_e

    .line 311
    .line 312
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 313
    .line 314
    check-cast p1, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    move-object p1, p0

    .line 329
    check-cast p1, Ljava/lang/String;

    .line 330
    .line 331
    goto/16 :goto_6

    .line 332
    .line 333
    :cond_e
    invoke-static {v4}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_f

    .line 342
    .line 343
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 344
    .line 345
    check-cast p1, Ljava/lang/Long;

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 348
    .line 349
    .line 350
    move-result-wide v0

    .line 351
    invoke-interface {p0, p2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 352
    .line 353
    .line 354
    move-result-wide p0

    .line 355
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    move-object p1, p0

    .line 360
    check-cast p1, Ljava/lang/String;

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_f
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_11

    .line 372
    .line 373
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 374
    .line 375
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    if-eqz p1, :cond_10

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_10
    new-instance p0, Ljava/lang/NullPointerException;

    .line 383
    .line 384
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw p0

    .line 388
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result p3

    .line 396
    if-eqz p3, :cond_12

    .line 397
    .line 398
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 399
    .line 400
    check-cast p1, Ljava/lang/Boolean;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 403
    .line 404
    .line 405
    move-result p1

    .line 406
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    move-object p1, p0

    .line 415
    check-cast p1, Ljava/lang/String;

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_12
    iget-object p3, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 419
    .line 420
    invoke-interface {p3, p2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p2

    .line 424
    if-eqz p2, :cond_16

    .line 425
    .line 426
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 427
    .line 428
    .line 429
    move-result p3

    .line 430
    if-nez p3, :cond_13

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_13
    :try_start_1
    iget-object p0, p0, Ly2/a;->b:Lo7/y;

    .line 434
    .line 435
    invoke-virtual {p0, v8}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    invoke-virtual {p0, p2}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 443
    goto :goto_4

    .line 444
    :catchall_1
    move-exception p0

    .line 445
    invoke-static {p0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    :goto_4
    instance-of p2, p0, LA7/i;

    .line 450
    .line 451
    if-eqz p2, :cond_14

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_14
    move-object v1, p0

    .line 455
    :goto_5
    if-nez v1, :cond_15

    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_15
    move-object p1, v1

    .line 459
    :cond_16
    :goto_6
    check-cast p1, Ljava/lang/CharSequence;

    .line 460
    .line 461
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 462
    .line 463
    .line 464
    move-result p0

    .line 465
    if-eqz p0, :cond_17

    .line 466
    .line 467
    sget-object p0, Lg6/o;->a:Lg6/o;

    .line 468
    .line 469
    invoke-virtual {p0}, Lg6/o;->K()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    :cond_17
    move-object v7, p1

    .line 474
    check-cast v7, Ljava/lang/String;

    .line 475
    .line 476
    goto/16 :goto_a

    .line 477
    .line 478
    :cond_18
    sget-object p1, Lg6/o;->a:Lg6/o;

    .line 479
    .line 480
    invoke-virtual {p1}, Lg6/o;->k0()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p2

    .line 484
    invoke-virtual {p1}, Lg6/o;->Q0()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 489
    .line 490
    .line 491
    move-result-object p3

    .line 492
    invoke-static {v6}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_19

    .line 501
    .line 502
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 503
    .line 504
    check-cast p1, Ljava/lang/Float;

    .line 505
    .line 506
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 511
    .line 512
    .line 513
    move-result p0

    .line 514
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    move-object p1, p0

    .line 519
    check-cast p1, Ljava/lang/String;

    .line 520
    .line 521
    goto/16 :goto_9

    .line 522
    .line 523
    :cond_19
    invoke-static {v5}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_1a

    .line 532
    .line 533
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 534
    .line 535
    check-cast p1, Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result p1

    .line 541
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 542
    .line 543
    .line 544
    move-result p0

    .line 545
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    move-object p1, p0

    .line 550
    check-cast p1, Ljava/lang/String;

    .line 551
    .line 552
    goto/16 :goto_9

    .line 553
    .line 554
    :cond_1a
    invoke-static {v4}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_1b

    .line 563
    .line 564
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 565
    .line 566
    check-cast p1, Ljava/lang/Long;

    .line 567
    .line 568
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 569
    .line 570
    .line 571
    move-result-wide v0

    .line 572
    invoke-interface {p0, p2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 573
    .line 574
    .line 575
    move-result-wide p0

    .line 576
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 577
    .line 578
    .line 579
    move-result-object p0

    .line 580
    move-object p1, p0

    .line 581
    check-cast p1, Ljava/lang/String;

    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_1b
    invoke-static {v8}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_1d

    .line 593
    .line 594
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 595
    .line 596
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    if-eqz p1, :cond_1c

    .line 601
    .line 602
    goto :goto_9

    .line 603
    :cond_1c
    new-instance p0, Ljava/lang/NullPointerException;

    .line 604
    .line 605
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw p0

    .line 609
    :cond_1d
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {p3, v0}, Lkotlin/jvm/internal/d;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result p3

    .line 617
    if-eqz p3, :cond_1e

    .line 618
    .line 619
    iget-object p0, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 620
    .line 621
    check-cast p1, Ljava/lang/Boolean;

    .line 622
    .line 623
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    invoke-interface {p0, p2, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 628
    .line 629
    .line 630
    move-result p0

    .line 631
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    move-object p1, p0

    .line 636
    check-cast p1, Ljava/lang/String;

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_1e
    iget-object p3, p0, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 640
    .line 641
    invoke-interface {p3, p2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object p2

    .line 645
    if-eqz p2, :cond_22

    .line 646
    .line 647
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 648
    .line 649
    .line 650
    move-result p3

    .line 651
    if-nez p3, :cond_1f

    .line 652
    .line 653
    goto :goto_9

    .line 654
    :cond_1f
    :try_start_2
    iget-object p0, p0, Ly2/a;->b:Lo7/y;

    .line 655
    .line 656
    invoke-virtual {p0, v8}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    invoke-virtual {p0, p2}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 664
    goto :goto_7

    .line 665
    :catchall_2
    move-exception p0

    .line 666
    invoke-static {p0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    :goto_7
    instance-of p2, p0, LA7/i;

    .line 671
    .line 672
    if-eqz p2, :cond_20

    .line 673
    .line 674
    goto :goto_8

    .line 675
    :cond_20
    move-object v1, p0

    .line 676
    :goto_8
    if-nez v1, :cond_21

    .line 677
    .line 678
    goto :goto_9

    .line 679
    :cond_21
    move-object p1, v1

    .line 680
    :cond_22
    :goto_9
    check-cast p1, Ljava/lang/CharSequence;

    .line 681
    .line 682
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 683
    .line 684
    .line 685
    move-result p0

    .line 686
    if-eqz p0, :cond_23

    .line 687
    .line 688
    sget-object p0, Lg6/o;->a:Lg6/o;

    .line 689
    .line 690
    invoke-virtual {p0}, Lg6/o;->Q0()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    :cond_23
    move-object v7, p1

    .line 695
    check-cast v7, Ljava/lang/String;

    .line 696
    .line 697
    :cond_24
    :goto_a
    return-object v7
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
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
