.class public final LN1/d;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final synthetic u:I

.field public final v:Ljava/lang/Object;

.field public final w:LW/g;


# direct methods
.method public constructor <init>(LJ1/b1;LG0/h;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LN1/d;->u:I

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    iput-object p1, p0, LN1/d;->w:LW/g;

    iput-object p2, p0, LN1/d;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ1/d1;LX1/C;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LN1/d;->u:I

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    iput-object p1, p0, LN1/d;->w:LW/g;

    iput-object p2, p0, LN1/d;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ1/u1;LG0/h;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LN1/d;->u:I

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    iput-object p1, p0, LN1/d;->w:LW/g;

    iput-object p2, p0, LN1/d;->v:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LM1/e;LW/g;I)V
    .locals 0

    .line 1
    iput p3, p0, LN1/d;->u:I

    iput-object p1, p0, LN1/d;->v:Ljava/lang/Object;

    invoke-direct {p0, p2}, LM1/o;-><init>(LW/g;)V

    iput-object p2, p0, LN1/d;->w:LW/g;

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f1400b8

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/16 v7, 0xa

    .line 8
    .line 9
    sget-object v8, LJ2/b;->c:LJ2/b;

    .line 10
    .line 11
    const-string v9, "viewBackgroundSelected"

    .line 12
    .line 13
    const v11, 0x7f080251

    .line 14
    .line 15
    .line 16
    const v12, 0x7f0700b5

    .line 17
    .line 18
    .line 19
    const-string v13, "imageMovie"

    .line 20
    .line 21
    iget-object v14, v0, LF0/r0;->a:Landroid/view/View;

    .line 22
    .line 23
    const/16 v15, 0x8

    .line 24
    .line 25
    iget-object v3, v0, LN1/d;->v:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v4, v0, LN1/d;->w:LW/g;

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    const/4 v6, 0x0

    .line 31
    iget v10, v0, LN1/d;->u:I

    .line 32
    .line 33
    packed-switch v10, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, LI2/c;

    .line 39
    .line 40
    check-cast v3, Ln2/h;

    .line 41
    .line 42
    iget v2, v3, Ln2/h;->e:I

    .line 43
    .line 44
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-ne v2, v7, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v5, v6

    .line 52
    :goto_0
    check-cast v4, LJ1/z1;

    .line 53
    .line 54
    iget-object v2, v4, LJ1/z1;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    iget-object v1, v1, LI2/c;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    move v10, v11

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const v10, 0x7f080253

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object v1, v4, LJ1/z1;->x:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    invoke-virtual {v1, v10}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v4, LJ1/z1;->w:Landroid/view/View;

    .line 74
    .line 75
    invoke-static {v1, v9}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    move v15, v6

    .line 81
    :cond_2
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, LI5/k;

    .line 85
    .line 86
    const/16 v2, 0x16

    .line 87
    .line 88
    invoke-direct {v1, v3, v2, v0}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v4, LW/g;->k:Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_0
    move-object/from16 v1, p1

    .line 98
    .line 99
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 100
    .line 101
    check-cast v4, LJ1/C1;

    .line 102
    .line 103
    iget-object v2, v4, LJ1/C1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 104
    .line 105
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v7}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    new-instance v8, LC1/h;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    iget-object v9, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 126
    .line 127
    iput-object v9, v8, LC1/h;->c:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {v8, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 130
    .line 131
    .line 132
    new-instance v2, LF1/b;

    .line 133
    .line 134
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    invoke-direct {v2, v9}, LF1/b;-><init>(F)V

    .line 147
    .line 148
    .line 149
    new-array v5, v5, [LF1/c;

    .line 150
    .line 151
    aput-object v2, v5, v6

    .line 152
    .line 153
    invoke-static {v5}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iput-object v2, v8, LC1/h;->e:Ljava/util/List;

    .line 162
    .line 163
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v7, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 168
    .line 169
    .line 170
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v5, v4, LJ1/C1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 173
    .line 174
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    new-instance v2, LI5/k;

    .line 178
    .line 179
    check-cast v3, Ll2/o;

    .line 180
    .line 181
    const/16 v5, 0x15

    .line 182
    .line 183
    invoke-direct {v2, v3, v5, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v4, LW/g;->k:Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_1
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 195
    .line 196
    check-cast v4, LJ1/u1;

    .line 197
    .line 198
    iget-object v2, v4, LJ1/u1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 199
    .line 200
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v3}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    new-instance v9, LC1/h;

    .line 212
    .line 213
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-direct {v9, v10}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 218
    .line 219
    .line 220
    iget-object v10, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v10, v9, LC1/h;->c:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-virtual {v9, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 225
    .line 226
    .line 227
    new-instance v2, LF1/b;

    .line 228
    .line 229
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-virtual {v10, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-direct {v2, v10}, LF1/b;-><init>(F)V

    .line 242
    .line 243
    .line 244
    new-array v10, v5, [LF1/c;

    .line 245
    .line 246
    aput-object v2, v10, v6

    .line 247
    .line 248
    invoke-static {v10}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    iput-object v2, v9, LC1/h;->e:Ljava/util/List;

    .line 257
    .line 258
    invoke-virtual {v9}, LC1/h;->a()LC1/i;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v3, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 263
    .line 264
    .line 265
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v3, v4, LJ1/u1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 268
    .line 269
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-nez v2, :cond_3

    .line 277
    .line 278
    move v2, v6

    .line 279
    goto :goto_2

    .line 280
    :cond_3
    move v2, v15

    .line 281
    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 282
    .line 283
    .line 284
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 285
    .line 286
    iget-object v3, v4, LJ1/u1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 287
    .line 288
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-nez v2, :cond_4

    .line 296
    .line 297
    move v2, v6

    .line 298
    goto :goto_3

    .line 299
    :cond_4
    move v2, v15

    .line 300
    :goto_3
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    iget v2, v1, Lcom/anilab/domain/model/Movie;->k:I

    .line 304
    .line 305
    iget-object v3, v4, LW/g;->k:Landroid/view/View;

    .line 306
    .line 307
    iget-object v9, v4, LJ1/u1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 308
    .line 309
    if-lez v2, :cond_6

    .line 310
    .line 311
    iget-object v10, v1, Lcom/anilab/domain/model/Movie;->h:LJ2/b;

    .line 312
    .line 313
    if-ne v10, v8, :cond_6

    .line 314
    .line 315
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    if-ge v2, v7, :cond_5

    .line 320
    .line 321
    const v7, 0x7f1400b3

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_5
    const v7, 0x7f1400b7

    .line 326
    .line 327
    .line 328
    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    new-array v5, v5, [Ljava/lang/Object;

    .line 333
    .line 334
    aput-object v2, v5, v6

    .line 335
    .line 336
    invoke-virtual {v8, v7, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_6
    const-string v2, "textLastEpisode"

    .line 348
    .line 349
    invoke-static {v9, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v9, v15}, Landroid/view/View;->setVisibility(I)V

    .line 353
    .line 354
    .line 355
    :goto_5
    iget-object v2, v4, LJ1/u1;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 356
    .line 357
    iget-object v4, v1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    new-instance v2, LI5/k;

    .line 363
    .line 364
    const/16 v4, 0x14

    .line 365
    .line 366
    invoke-direct {v2, v0, v4, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_2
    move-object/from16 v1, p1

    .line 374
    .line 375
    check-cast v1, LH2/z;

    .line 376
    .line 377
    check-cast v4, LJ1/m1;

    .line 378
    .line 379
    iget-object v2, v4, LJ1/m1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 380
    .line 381
    iget v5, v1, LH2/z;->a:I

    .line 382
    .line 383
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 388
    .line 389
    .line 390
    check-cast v3, Li2/j;

    .line 391
    .line 392
    iget v2, v3, Li2/j;->e:I

    .line 393
    .line 394
    iget-object v3, v4, LJ1/m1;->v:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 395
    .line 396
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 397
    .line 398
    .line 399
    iget v1, v1, LH2/z;->b:I

    .line 400
    .line 401
    invoke-virtual {v3, v1}, LA5/d;->setProgress(I)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_3
    move-object/from16 v1, p1

    .line 406
    .line 407
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 408
    .line 409
    check-cast v4, LJ1/b1;

    .line 410
    .line 411
    iget-object v2, v4, LJ1/b1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 412
    .line 413
    iget-object v3, v1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    .line 417
    .line 418
    const-string v2, "textRating"

    .line 419
    .line 420
    iget-object v7, v4, LJ1/b1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 421
    .line 422
    invoke-static {v7, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v3}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-nez v2, :cond_7

    .line 430
    .line 431
    move v2, v6

    .line 432
    goto :goto_6

    .line 433
    :cond_7
    move v2, v15

    .line 434
    :goto_6
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 435
    .line 436
    .line 437
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 438
    .line 439
    iget-object v3, v4, LJ1/b1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 440
    .line 441
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    .line 443
    .line 444
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_8

    .line 449
    .line 450
    move v15, v6

    .line 451
    :cond_8
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 452
    .line 453
    .line 454
    iget-object v2, v4, LJ1/b1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 455
    .line 456
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-static {v3}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    new-instance v7, LC1/h;

    .line 468
    .line 469
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    invoke-direct {v7, v8}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 474
    .line 475
    .line 476
    iget-object v8, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 477
    .line 478
    iput-object v8, v7, LC1/h;->c:Ljava/lang/Object;

    .line 479
    .line 480
    invoke-virtual {v7, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 481
    .line 482
    .line 483
    new-instance v2, LF1/b;

    .line 484
    .line 485
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    int-to-float v8, v8

    .line 494
    invoke-direct {v2, v8}, LF1/b;-><init>(F)V

    .line 495
    .line 496
    .line 497
    new-array v5, v5, [LF1/c;

    .line 498
    .line 499
    aput-object v2, v5, v6

    .line 500
    .line 501
    invoke-static {v5}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    iput-object v2, v7, LC1/h;->e:Ljava/util/List;

    .line 510
    .line 511
    invoke-virtual {v7}, LC1/h;->a()LC1/i;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-virtual {v3, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 516
    .line 517
    .line 518
    new-instance v2, LI5/k;

    .line 519
    .line 520
    const/16 v3, 0x10

    .line 521
    .line 522
    invoke-direct {v2, v0, v3, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v4, LW/g;->k:Landroid/view/View;

    .line 526
    .line 527
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_4
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 534
    .line 535
    check-cast v4, LJ1/d1;

    .line 536
    .line 537
    iget-object v2, v4, LJ1/d1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 538
    .line 539
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    invoke-static {v3}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    new-instance v7, LC1/h;

    .line 551
    .line 552
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    invoke-direct {v7, v8}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 557
    .line 558
    .line 559
    iget-object v8, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 560
    .line 561
    iput-object v8, v7, LC1/h;->c:Ljava/lang/Object;

    .line 562
    .line 563
    invoke-virtual {v7, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 564
    .line 565
    .line 566
    new-instance v2, LF1/b;

    .line 567
    .line 568
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    invoke-direct {v2, v8}, LF1/b;-><init>(F)V

    .line 581
    .line 582
    .line 583
    new-array v5, v5, [LF1/c;

    .line 584
    .line 585
    aput-object v2, v5, v6

    .line 586
    .line 587
    invoke-static {v5}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    iput-object v2, v7, LC1/h;->e:Ljava/util/List;

    .line 596
    .line 597
    invoke-virtual {v7}, LC1/h;->a()LC1/i;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-virtual {v3, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 602
    .line 603
    .line 604
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 605
    .line 606
    iget-object v3, v4, LJ1/d1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 607
    .line 608
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 609
    .line 610
    .line 611
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-nez v2, :cond_9

    .line 616
    .line 617
    move v2, v6

    .line 618
    goto :goto_7

    .line 619
    :cond_9
    move v2, v15

    .line 620
    :goto_7
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 621
    .line 622
    .line 623
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 624
    .line 625
    iget-object v3, v4, LJ1/d1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 626
    .line 627
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 628
    .line 629
    .line 630
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    if-nez v2, :cond_a

    .line 635
    .line 636
    goto :goto_8

    .line 637
    :cond_a
    move v6, v15

    .line 638
    :goto_8
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 639
    .line 640
    .line 641
    new-instance v2, LI5/k;

    .line 642
    .line 643
    invoke-direct {v2, v0, v15, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    iget-object v1, v4, LW/g;->k:Landroid/view/View;

    .line 647
    .line 648
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :pswitch_5
    move-object/from16 v1, p1

    .line 653
    .line 654
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 655
    .line 656
    check-cast v4, LJ1/f1;

    .line 657
    .line 658
    iget-object v2, v4, LJ1/f1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 659
    .line 660
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    invoke-static {v7}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    new-instance v8, LC1/h;

    .line 672
    .line 673
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 674
    .line 675
    .line 676
    move-result-object v9

    .line 677
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 678
    .line 679
    .line 680
    iget-object v9, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 681
    .line 682
    iput-object v9, v8, LC1/h;->c:Ljava/lang/Object;

    .line 683
    .line 684
    invoke-virtual {v8, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 685
    .line 686
    .line 687
    new-instance v2, LF1/b;

    .line 688
    .line 689
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 690
    .line 691
    .line 692
    move-result-object v9

    .line 693
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 698
    .line 699
    .line 700
    move-result v9

    .line 701
    invoke-direct {v2, v9}, LF1/b;-><init>(F)V

    .line 702
    .line 703
    .line 704
    new-array v5, v5, [LF1/c;

    .line 705
    .line 706
    aput-object v2, v5, v6

    .line 707
    .line 708
    invoke-static {v5}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    iput-object v2, v8, LC1/h;->e:Ljava/util/List;

    .line 717
    .line 718
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-virtual {v7, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 723
    .line 724
    .line 725
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 726
    .line 727
    iget-object v5, v4, LJ1/f1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 728
    .line 729
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 730
    .line 731
    .line 732
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    if-nez v2, :cond_b

    .line 737
    .line 738
    move v2, v6

    .line 739
    goto :goto_9

    .line 740
    :cond_b
    move v2, v15

    .line 741
    :goto_9
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 742
    .line 743
    .line 744
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 745
    .line 746
    iget-object v5, v4, LJ1/f1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 747
    .line 748
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 749
    .line 750
    .line 751
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    if-nez v2, :cond_c

    .line 756
    .line 757
    move v15, v6

    .line 758
    :cond_c
    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    .line 759
    .line 760
    .line 761
    new-instance v2, LI5/k;

    .line 762
    .line 763
    check-cast v3, LV1/p;

    .line 764
    .line 765
    const/4 v5, 0x6

    .line 766
    invoke-direct {v2, v3, v5, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    iget-object v1, v4, LW/g;->k:Landroid/view/View;

    .line 770
    .line 771
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 772
    .line 773
    .line 774
    return-void

    .line 775
    :pswitch_6
    move-object/from16 v1, p1

    .line 776
    .line 777
    check-cast v1, Lcom/anilab/domain/model/Genre;

    .line 778
    .line 779
    check-cast v3, LU1/m;

    .line 780
    .line 781
    iget-object v5, v3, LU1/m;->e:Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    check-cast v4, LJ1/W0;

    .line 788
    .line 789
    iget-object v6, v4, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 790
    .line 791
    if-eqz v5, :cond_d

    .line 792
    .line 793
    const v7, 0x7f080091

    .line 794
    .line 795
    .line 796
    goto :goto_a

    .line 797
    :cond_d
    const v7, 0x7f080080

    .line 798
    .line 799
    .line 800
    :goto_a
    invoke-virtual {v6, v7}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 801
    .line 802
    .line 803
    iget-object v4, v4, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 804
    .line 805
    iget-object v6, v1, Lcom/anilab/domain/model/Genre;->b:Ljava/lang/String;

    .line 806
    .line 807
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    if-eqz v5, :cond_e

    .line 815
    .line 816
    const v5, 0x7f060382

    .line 817
    .line 818
    .line 819
    goto :goto_b

    .line 820
    :cond_e
    const v5, 0x7f060063

    .line 821
    .line 822
    .line 823
    :goto_b
    invoke-virtual {v6, v5}, Landroid/content/Context;->getColor(I)I

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 828
    .line 829
    .line 830
    new-instance v5, LN1/e;

    .line 831
    .line 832
    invoke-direct {v5, v3, v1, v0, v2}, LN1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :pswitch_7
    move-object/from16 v1, p1

    .line 840
    .line 841
    check-cast v1, Lcom/anilab/domain/model/FilterConfig;

    .line 842
    .line 843
    check-cast v3, LU1/a;

    .line 844
    .line 845
    iget v2, v3, LU1/a;->e:I

    .line 846
    .line 847
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 848
    .line 849
    .line 850
    move-result v7

    .line 851
    if-ne v2, v7, :cond_f

    .line 852
    .line 853
    goto :goto_c

    .line 854
    :cond_f
    move v5, v6

    .line 855
    :goto_c
    check-cast v4, LJ1/W0;

    .line 856
    .line 857
    iget-object v2, v4, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 858
    .line 859
    if-eqz v5, :cond_10

    .line 860
    .line 861
    const v6, 0x7f080091

    .line 862
    .line 863
    .line 864
    goto :goto_d

    .line 865
    :cond_10
    const v6, 0x7f080080

    .line 866
    .line 867
    .line 868
    :goto_d
    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    if-eqz v5, :cond_11

    .line 876
    .line 877
    const v5, 0x7f060382

    .line 878
    .line 879
    .line 880
    goto :goto_e

    .line 881
    :cond_11
    const v5, 0x7f060063

    .line 882
    .line 883
    .line 884
    :goto_e
    invoke-virtual {v2, v5}, Landroid/content/Context;->getColor(I)I

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    iget-object v4, v4, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 889
    .line 890
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 891
    .line 892
    .line 893
    iget-object v1, v1, Lcom/anilab/domain/model/FilterConfig;->a:Ljava/lang/String;

    .line 894
    .line 895
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 896
    .line 897
    .line 898
    new-instance v1, LI5/k;

    .line 899
    .line 900
    const/4 v2, 0x5

    .line 901
    invoke-direct {v1, v3, v2, v0}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    :pswitch_8
    move-object/from16 v1, p1

    .line 909
    .line 910
    check-cast v1, LH2/t;

    .line 911
    .line 912
    check-cast v4, LJ1/k1;

    .line 913
    .line 914
    iget-object v7, v4, LJ1/k1;->A:Landroidx/appcompat/widget/AppCompatImageView;

    .line 915
    .line 916
    check-cast v3, LT1/c;

    .line 917
    .line 918
    iget v8, v3, LT1/c;->e:I

    .line 919
    .line 920
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 921
    .line 922
    .line 923
    move-result v10

    .line 924
    if-ne v8, v10, :cond_12

    .line 925
    .line 926
    move v10, v11

    .line 927
    goto :goto_f

    .line 928
    :cond_12
    const v10, 0x7f080253

    .line 929
    .line 930
    .line 931
    :goto_f
    invoke-virtual {v7, v10}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 932
    .line 933
    .line 934
    iget-object v7, v4, LJ1/k1;->z:Landroid/view/View;

    .line 935
    .line 936
    invoke-static {v7, v9}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    iget v8, v3, LT1/c;->e:I

    .line 940
    .line 941
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 942
    .line 943
    .line 944
    move-result v9

    .line 945
    if-ne v8, v9, :cond_13

    .line 946
    .line 947
    goto :goto_10

    .line 948
    :cond_13
    move v5, v6

    .line 949
    :goto_10
    if-eqz v5, :cond_14

    .line 950
    .line 951
    move v5, v6

    .line 952
    goto :goto_11

    .line 953
    :cond_14
    move v5, v15

    .line 954
    :goto_11
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 955
    .line 956
    .line 957
    iget v5, v1, LH2/t;->f:I

    .line 958
    .line 959
    int-to-float v5, v5

    .line 960
    int-to-float v2, v2

    .line 961
    div-float/2addr v5, v2

    .line 962
    iget-object v2, v4, LJ1/k1;->w:Landroidx/appcompat/widget/AppCompatRatingBar;

    .line 963
    .line 964
    invoke-virtual {v2, v5}, Landroid/widget/RatingBar;->setRating(F)V

    .line 965
    .line 966
    .line 967
    const-wide/16 v7, -0x1

    .line 968
    .line 969
    iget-wide v9, v1, LH2/t;->a:J

    .line 970
    .line 971
    cmp-long v2, v9, v7

    .line 972
    .line 973
    iget-object v5, v4, LW/g;->k:Landroid/view/View;

    .line 974
    .line 975
    const-string v7, "textRecommend"

    .line 976
    .line 977
    const-string v8, "imagePlayerLogo"

    .line 978
    .line 979
    iget-object v9, v4, LJ1/k1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 980
    .line 981
    iget-object v10, v4, LJ1/k1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 982
    .line 983
    iget-object v11, v4, LJ1/k1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 984
    .line 985
    if-nez v2, :cond_15

    .line 986
    .line 987
    invoke-static {v11, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    const v1, 0x7f080157

    .line 991
    .line 992
    .line 993
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    invoke-static {v2}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    new-instance v8, LC1/h;

    .line 1006
    .line 1007
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v12

    .line 1011
    invoke-direct {v8, v12}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1012
    .line 1013
    .line 1014
    iput-object v1, v8, LC1/h;->c:Ljava/lang/Object;

    .line 1015
    .line 1016
    invoke-virtual {v8, v11}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    invoke-virtual {v2, v1}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    const v2, 0x7f14001d

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v9, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_12

    .line 1047
    :cond_15
    invoke-static {v11, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    invoke-static {v2}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v2

    .line 1058
    new-instance v8, LC1/h;

    .line 1059
    .line 1060
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v12

    .line 1064
    invoke-direct {v8, v12}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1065
    .line 1066
    .line 1067
    iget-object v12, v1, LH2/t;->c:Ljava/lang/String;

    .line 1068
    .line 1069
    iput-object v12, v8, LC1/h;->c:Ljava/lang/Object;

    .line 1070
    .line 1071
    invoke-virtual {v8, v11}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v8

    .line 1078
    invoke-virtual {v2, v8}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1079
    .line 1080
    .line 1081
    iget-object v2, v1, LH2/t;->b:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v9, v7}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    iget-boolean v1, v1, LH2/t;->e:Z

    .line 1090
    .line 1091
    if-eqz v1, :cond_16

    .line 1092
    .line 1093
    move v15, v6

    .line 1094
    :cond_16
    invoke-virtual {v9, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1095
    .line 1096
    .line 1097
    :goto_12
    new-instance v1, LI5/k;

    .line 1098
    .line 1099
    const/4 v2, 0x4

    .line 1100
    invoke-direct {v1, v3, v2, v0}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v4}, LW/g;->c0()V

    .line 1107
    .line 1108
    .line 1109
    return-void

    .line 1110
    :pswitch_9
    move-object/from16 v1, p1

    .line 1111
    .line 1112
    check-cast v1, LH2/a;

    .line 1113
    .line 1114
    check-cast v4, LJ1/I0;

    .line 1115
    .line 1116
    iget-object v2, v4, LJ1/I0;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1117
    .line 1118
    const-string v5, "imageAvatar"

    .line 1119
    .line 1120
    invoke-static {v2, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v5

    .line 1127
    invoke-static {v5}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v5

    .line 1131
    new-instance v6, LC1/h;

    .line 1132
    .line 1133
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v7

    .line 1137
    invoke-direct {v6, v7}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1138
    .line 1139
    .line 1140
    iget-object v7, v1, LH2/a;->b:Ljava/lang/String;

    .line 1141
    .line 1142
    iput-object v7, v6, LC1/h;->c:Ljava/lang/Object;

    .line 1143
    .line 1144
    invoke-virtual {v6, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v6}, LC1/h;->a()LC1/i;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    invoke-virtual {v5, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1152
    .line 1153
    .line 1154
    new-instance v2, LI5/k;

    .line 1155
    .line 1156
    check-cast v3, LS1/a;

    .line 1157
    .line 1158
    const/4 v5, 0x3

    .line 1159
    invoke-direct {v2, v3, v5, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1160
    .line 1161
    .line 1162
    iget-object v1, v4, LW/g;->k:Landroid/view/View;

    .line 1163
    .line 1164
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1165
    .line 1166
    .line 1167
    return-void

    .line 1168
    :pswitch_a
    move-object/from16 v2, p1

    .line 1169
    .line 1170
    check-cast v2, LH2/i;

    .line 1171
    .line 1172
    check-cast v4, LJ1/w1;

    .line 1173
    .line 1174
    iget-object v7, v4, LJ1/w1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1175
    .line 1176
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    iget v9, v2, LH2/i;->c:I

    .line 1181
    .line 1182
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v9

    .line 1186
    new-array v10, v5, [Ljava/lang/Object;

    .line 1187
    .line 1188
    aput-object v9, v10, v6

    .line 1189
    .line 1190
    invoke-virtual {v8, v1, v10}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1

    .line 1194
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1195
    .line 1196
    .line 1197
    iget-object v1, v4, LJ1/w1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1198
    .line 1199
    invoke-static {v1, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    check-cast v3, LR1/C;

    .line 1203
    .line 1204
    iget-object v7, v3, LR1/C;->e:Ljava/lang/String;

    .line 1205
    .line 1206
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v8

    .line 1210
    invoke-static {v8}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    new-instance v9, LC1/h;

    .line 1215
    .line 1216
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v10

    .line 1220
    invoke-direct {v9, v10}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1221
    .line 1222
    .line 1223
    iput-object v7, v9, LC1/h;->c:Ljava/lang/Object;

    .line 1224
    .line 1225
    invoke-virtual {v9, v1}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1226
    .line 1227
    .line 1228
    new-instance v1, LF1/b;

    .line 1229
    .line 1230
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v7

    .line 1234
    invoke-virtual {v7, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1235
    .line 1236
    .line 1237
    move-result v7

    .line 1238
    int-to-float v7, v7

    .line 1239
    invoke-direct {v1, v7}, LF1/b;-><init>(F)V

    .line 1240
    .line 1241
    .line 1242
    new-array v7, v5, [LF1/c;

    .line 1243
    .line 1244
    aput-object v1, v7, v6

    .line 1245
    .line 1246
    invoke-static {v7}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    iput-object v1, v9, LC1/h;->e:Ljava/util/List;

    .line 1255
    .line 1256
    invoke-virtual {v9}, LC1/h;->a()LC1/i;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    invoke-virtual {v8, v1}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1261
    .line 1262
    .line 1263
    const-string v1, "viewSelectEpisode"

    .line 1264
    .line 1265
    iget-object v7, v4, LJ1/w1;->x:Landroid/widget/FrameLayout;

    .line 1266
    .line 1267
    invoke-static {v7, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    iget v1, v3, LR1/C;->h:I

    .line 1271
    .line 1272
    invoke-virtual {v0}, LF0/r0;->b()I

    .line 1273
    .line 1274
    .line 1275
    move-result v8

    .line 1276
    if-ne v1, v8, :cond_17

    .line 1277
    .line 1278
    move v15, v6

    .line 1279
    :cond_17
    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1280
    .line 1281
    .line 1282
    new-instance v1, LN1/e;

    .line 1283
    .line 1284
    invoke-direct {v1, v3, v2, v0, v5}, LN1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1285
    .line 1286
    .line 1287
    iget-object v2, v4, LW/g;->k:Landroid/view/View;

    .line 1288
    .line 1289
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1290
    .line 1291
    .line 1292
    return-void

    .line 1293
    :pswitch_b
    move-object/from16 v1, p1

    .line 1294
    .line 1295
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 1296
    .line 1297
    check-cast v4, LJ1/M0;

    .line 1298
    .line 1299
    iget-object v2, v4, LJ1/M0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1300
    .line 1301
    invoke-static {v2, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v7

    .line 1308
    invoke-static {v7}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v7

    .line 1312
    new-instance v8, LC1/h;

    .line 1313
    .line 1314
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v9

    .line 1318
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1319
    .line 1320
    .line 1321
    iget-object v9, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 1322
    .line 1323
    iput-object v9, v8, LC1/h;->c:Ljava/lang/Object;

    .line 1324
    .line 1325
    invoke-virtual {v8, v2}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1326
    .line 1327
    .line 1328
    new-instance v2, LF1/b;

    .line 1329
    .line 1330
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v9

    .line 1334
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1335
    .line 1336
    .line 1337
    move-result v9

    .line 1338
    int-to-float v9, v9

    .line 1339
    invoke-direct {v2, v9}, LF1/b;-><init>(F)V

    .line 1340
    .line 1341
    .line 1342
    new-array v9, v5, [LF1/c;

    .line 1343
    .line 1344
    aput-object v2, v9, v6

    .line 1345
    .line 1346
    invoke-static {v9}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v2

    .line 1354
    iput-object v2, v8, LC1/h;->e:Ljava/util/List;

    .line 1355
    .line 1356
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v2

    .line 1360
    invoke-virtual {v7, v2}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1361
    .line 1362
    .line 1363
    iget-object v2, v4, LJ1/M0;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1364
    .line 1365
    invoke-virtual {v1}, Lcom/anilab/domain/model/Movie;->a()Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v7

    .line 1369
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1370
    .line 1371
    .line 1372
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 1373
    .line 1374
    iget-object v7, v4, LJ1/M0;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1375
    .line 1376
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v2

    .line 1383
    if-nez v2, :cond_18

    .line 1384
    .line 1385
    move v2, v6

    .line 1386
    goto :goto_13

    .line 1387
    :cond_18
    move v2, v15

    .line 1388
    :goto_13
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1389
    .line 1390
    .line 1391
    iget-object v2, v1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 1392
    .line 1393
    iget-object v7, v4, LJ1/M0;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1394
    .line 1395
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1396
    .line 1397
    .line 1398
    invoke-static {v2}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    if-nez v2, :cond_19

    .line 1403
    .line 1404
    move v15, v6

    .line 1405
    :cond_19
    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1406
    .line 1407
    .line 1408
    iget-object v2, v4, LJ1/M0;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1409
    .line 1410
    iget-object v7, v1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 1411
    .line 1412
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1413
    .line 1414
    .line 1415
    iget v2, v1, Lcom/anilab/domain/model/Movie;->g:I

    .line 1416
    .line 1417
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v2

    .line 1421
    iget-object v7, v4, LJ1/M0;->B:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1422
    .line 1423
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1424
    .line 1425
    .line 1426
    iget-boolean v2, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 1427
    .line 1428
    const v7, 0x106000d

    .line 1429
    .line 1430
    .line 1431
    const v8, 0x7f060057

    .line 1432
    .line 1433
    .line 1434
    if-eqz v2, :cond_1a

    .line 1435
    .line 1436
    move v2, v8

    .line 1437
    goto :goto_14

    .line 1438
    :cond_1a
    move v2, v7

    .line 1439
    :goto_14
    iget-object v9, v4, LJ1/M0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 1440
    .line 1441
    invoke-virtual {v9, v2}, Lcom/google/android/material/button/MaterialButton;->setStrokeColorResource(I)V

    .line 1442
    .line 1443
    .line 1444
    iget-object v2, v4, LW/g;->k:Landroid/view/View;

    .line 1445
    .line 1446
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v4

    .line 1450
    iget-boolean v10, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 1451
    .line 1452
    if-eqz v10, :cond_1b

    .line 1453
    .line 1454
    goto :goto_15

    .line 1455
    :cond_1b
    move v7, v8

    .line 1456
    :goto_15
    invoke-virtual {v4, v7}, Landroid/content/Context;->getColor(I)I

    .line 1457
    .line 1458
    .line 1459
    move-result v4

    .line 1460
    invoke-virtual {v9, v4}, Lcom/google/android/material/button/MaterialButton;->setBackgroundColor(I)V

    .line 1461
    .line 1462
    .line 1463
    iget-boolean v4, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 1464
    .line 1465
    if-eqz v4, :cond_1c

    .line 1466
    .line 1467
    const v4, 0x7f080263

    .line 1468
    .line 1469
    .line 1470
    goto :goto_16

    .line 1471
    :cond_1c
    const v4, 0x7f080156

    .line 1472
    .line 1473
    .line 1474
    :goto_16
    invoke-virtual {v9, v4}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 1475
    .line 1476
    .line 1477
    iget-boolean v4, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 1478
    .line 1479
    const v7, 0x106000b

    .line 1480
    .line 1481
    .line 1482
    if-eqz v4, :cond_1d

    .line 1483
    .line 1484
    move v4, v8

    .line 1485
    goto :goto_17

    .line 1486
    :cond_1d
    move v4, v7

    .line 1487
    :goto_17
    invoke-virtual {v9, v4}, Lcom/google/android/material/button/MaterialButton;->setIconTintResource(I)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v4

    .line 1494
    iget-boolean v10, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 1495
    .line 1496
    if-eqz v10, :cond_1e

    .line 1497
    .line 1498
    goto :goto_18

    .line 1499
    :cond_1e
    move v8, v7

    .line 1500
    :goto_18
    invoke-virtual {v4, v8}, Landroid/content/Context;->getColor(I)I

    .line 1501
    .line 1502
    .line 1503
    move-result v4

    .line 1504
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1505
    .line 1506
    .line 1507
    new-instance v4, LN1/c;

    .line 1508
    .line 1509
    check-cast v3, LN1/f;

    .line 1510
    .line 1511
    invoke-direct {v4, v3, v1, v5}, LN1/c;-><init>(LN1/f;Lcom/anilab/domain/model/Movie;I)V

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1515
    .line 1516
    .line 1517
    new-instance v2, LN1/e;

    .line 1518
    .line 1519
    invoke-direct {v2, v3, v1, v0, v6}, LN1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1523
    .line 1524
    .line 1525
    return-void

    .line 1526
    :pswitch_c
    move-object/from16 v2, p1

    .line 1527
    .line 1528
    check-cast v2, Lcom/anilab/domain/model/Movie;

    .line 1529
    .line 1530
    check-cast v4, LJ1/f1;

    .line 1531
    .line 1532
    iget-object v9, v4, LJ1/f1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1533
    .line 1534
    invoke-static {v9, v13}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v10

    .line 1541
    invoke-static {v10}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v10

    .line 1545
    new-instance v11, LC1/h;

    .line 1546
    .line 1547
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v13

    .line 1551
    invoke-direct {v11, v13}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 1552
    .line 1553
    .line 1554
    iget-object v13, v2, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 1555
    .line 1556
    iput-object v13, v11, LC1/h;->c:Ljava/lang/Object;

    .line 1557
    .line 1558
    invoke-virtual {v11, v9}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 1559
    .line 1560
    .line 1561
    new-instance v9, LF1/b;

    .line 1562
    .line 1563
    invoke-virtual {v14}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v13

    .line 1567
    invoke-virtual {v13, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1568
    .line 1569
    .line 1570
    move-result v12

    .line 1571
    int-to-float v12, v12

    .line 1572
    invoke-direct {v9, v12}, LF1/b;-><init>(F)V

    .line 1573
    .line 1574
    .line 1575
    new-array v12, v5, [LF1/c;

    .line 1576
    .line 1577
    aput-object v9, v12, v6

    .line 1578
    .line 1579
    invoke-static {v12}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v9

    .line 1583
    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v9

    .line 1587
    iput-object v9, v11, LC1/h;->e:Ljava/util/List;

    .line 1588
    .line 1589
    invoke-virtual {v11}, LC1/h;->a()LC1/i;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v9

    .line 1593
    invoke-virtual {v10, v9}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 1594
    .line 1595
    .line 1596
    iget-object v9, v2, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 1597
    .line 1598
    iget-object v10, v4, LJ1/f1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1599
    .line 1600
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1601
    .line 1602
    .line 1603
    invoke-static {v9}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 1604
    .line 1605
    .line 1606
    move-result v9

    .line 1607
    if-nez v9, :cond_1f

    .line 1608
    .line 1609
    move v9, v6

    .line 1610
    goto :goto_19

    .line 1611
    :cond_1f
    move v9, v15

    .line 1612
    :goto_19
    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1613
    .line 1614
    .line 1615
    iget-object v9, v2, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 1616
    .line 1617
    iget-object v10, v4, LJ1/f1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1618
    .line 1619
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1620
    .line 1621
    .line 1622
    invoke-static {v9}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 1623
    .line 1624
    .line 1625
    move-result v9

    .line 1626
    if-nez v9, :cond_20

    .line 1627
    .line 1628
    move v9, v6

    .line 1629
    goto :goto_1a

    .line 1630
    :cond_20
    move v9, v15

    .line 1631
    :goto_1a
    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1632
    .line 1633
    .line 1634
    check-cast v3, LN1/f;

    .line 1635
    .line 1636
    iget-boolean v9, v3, LN1/f;->f:Z

    .line 1637
    .line 1638
    const-string v10, "viewShadow"

    .line 1639
    .line 1640
    iget-object v11, v4, LJ1/f1;->z:Landroid/view/View;

    .line 1641
    .line 1642
    iget-object v12, v4, LW/g;->k:Landroid/view/View;

    .line 1643
    .line 1644
    iget-object v4, v4, LJ1/f1;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1645
    .line 1646
    if-eqz v9, :cond_22

    .line 1647
    .line 1648
    iget v9, v2, Lcom/anilab/domain/model/Movie;->k:I

    .line 1649
    .line 1650
    if-lez v9, :cond_22

    .line 1651
    .line 1652
    iget-object v13, v2, Lcom/anilab/domain/model/Movie;->h:LJ2/b;

    .line 1653
    .line 1654
    if-ne v13, v8, :cond_22

    .line 1655
    .line 1656
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v8

    .line 1660
    if-ge v9, v7, :cond_21

    .line 1661
    .line 1662
    const v1, 0x7f1400b4

    .line 1663
    .line 1664
    .line 1665
    :cond_21
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v7

    .line 1669
    new-array v5, v5, [Ljava/lang/Object;

    .line 1670
    .line 1671
    aput-object v7, v5, v6

    .line 1672
    .line 1673
    invoke-virtual {v8, v1, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1681
    .line 1682
    .line 1683
    invoke-static {v11, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v11, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1687
    .line 1688
    .line 1689
    goto :goto_1b

    .line 1690
    :cond_22
    const-string v1, ""

    .line 1691
    .line 1692
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v4, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v11, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1702
    .line 1703
    .line 1704
    :goto_1b
    new-instance v1, LN1/c;

    .line 1705
    .line 1706
    invoke-direct {v1, v3, v2, v6}, LN1/c;-><init>(LN1/f;Lcom/anilab/domain/model/Movie;I)V

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v12, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1710
    .line 1711
    .line 1712
    return-void

    .line 1713
    :pswitch_data_0
    .packed-switch 0x0
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
