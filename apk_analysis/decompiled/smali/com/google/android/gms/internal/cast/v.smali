.class public final synthetic Lcom/google/android/gms/internal/cast/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/cast/w;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/cast/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/gms/internal/cast/v;->a:I

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/v;->b:Lcom/google/android/gms/internal/cast/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/v;->b:Lcom/google/android/gms/internal/cast/w;

    .line 2
    .line 3
    const/16 v1, 0x65

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    iget v5, p0, Lcom/google/android/gms/internal/cast/v;->a:I

    .line 9
    .line 10
    packed-switch v5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/internal/cast/W2;

    .line 14
    .line 15
    invoke-direct {v1, v3, v0}, Lcom/google/android/gms/internal/cast/W2;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/w;->f:Lu4/h;

    .line 19
    .line 20
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lu4/h;->a(Lu4/i;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    new-array v6, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    aput-object v5, v6, v4

    .line 37
    .line 38
    sget-object v7, Lcom/google/android/gms/internal/cast/w;->g:Ly4/b;

    .line 39
    .line 40
    iget-object v8, v7, Ly4/b;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v9, "transfer with type = %d has timed out"

    .line 43
    .line 44
    invoke-virtual {v7, v9, v6}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-static {v8, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    new-array v8, v3, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object v5, v8, v4

    .line 58
    .line 59
    aput-object v6, v8, v2

    .line 60
    .line 61
    const-string v5, "notify failed transfer with type = %d, reason = %d"

    .line 62
    .line 63
    invoke-virtual {v7, v5, v8}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v5, Ljava/util/HashSet;

    .line 67
    .line 68
    iget-object v6, v0, Lcom/google/android/gms/internal/cast/w;->b:Ljava/util/Set;

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Lcom/google/android/gms/internal/cast/p0;

    .line 88
    .line 89
    iget v7, v6, Lcom/google/android/gms/internal/cast/p0;->a:I

    .line 90
    .line 91
    packed-switch v7, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    new-instance v7, LA3/E;

    .line 95
    .line 96
    const/16 v8, 0xb

    .line 97
    .line 98
    const/16 v9, 0xa

    .line 99
    .line 100
    invoke-direct {v7, v8, v9}, LA3/E;-><init>(II)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iput-object v8, v7, LA3/E;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v6, v6, Lcom/google/android/gms/internal/cast/p0;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v6, LY2/r;

    .line 112
    .line 113
    iget-object v8, v6, LY2/r;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v8, Lcom/google/android/gms/internal/cast/g;

    .line 116
    .line 117
    iget v8, v8, Lcom/google/android/gms/internal/cast/g;->h:I

    .line 118
    .line 119
    if-ne v8, v3, :cond_0

    .line 120
    .line 121
    move v8, v2

    .line 122
    goto :goto_1

    .line 123
    :cond_0
    move v8, v4

    .line 124
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iput-object v8, v7, LA3/E;->d:Ljava/lang/Object;

    .line 129
    .line 130
    new-instance v8, Lcom/google/android/gms/internal/cast/D;

    .line 131
    .line 132
    invoke-direct {v8, v7}, Lcom/google/android/gms/internal/cast/D;-><init>(LA3/E;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v6, v8}, LY2/r;->W(LY2/r;Lcom/google/android/gms/internal/cast/D;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_1
    sget-object v7, Lcom/google/android/gms/internal/cast/s0;->i:Ly4/b;

    .line 140
    .line 141
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    new-array v10, v3, [Ljava/lang/Object;

    .line 150
    .line 151
    aput-object v8, v10, v4

    .line 152
    .line 153
    aput-object v9, v10, v2

    .line 154
    .line 155
    const-string v8, "onTransferFailed with type = %d and reason = %d"

    .line 156
    .line 157
    invoke-virtual {v7, v8, v10}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object v6, v6, Lcom/google/android/gms/internal/cast/p0;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, Lcom/google/android/gms/internal/cast/s0;

    .line 163
    .line 164
    invoke-virtual {v6}, Lcom/google/android/gms/internal/cast/s0;->c()V

    .line 165
    .line 166
    .line 167
    iget-object v7, v6, Lcom/google/android/gms/internal/cast/s0;->g:Lcom/google/android/gms/internal/cast/t0;

    .line 168
    .line 169
    iget-object v8, v6, Lcom/google/android/gms/internal/cast/s0;->c:Lcom/google/android/gms/internal/cast/v0;

    .line 170
    .line 171
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/cast/v0;->b(Lcom/google/android/gms/internal/cast/t0;)Lcom/google/android/gms/internal/cast/N0;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v7}, Lcom/google/android/gms/internal/cast/N0;->f()Lcom/google/android/gms/internal/cast/I0;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-static {v8}, Lcom/google/android/gms/internal/cast/I0;->m(Lcom/google/android/gms/internal/cast/I0;)Lcom/google/android/gms/internal/cast/H0;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-virtual {v8}, Lcom/google/android/gms/internal/cast/M2;->e()V

    .line 184
    .line 185
    .line 186
    iget-object v9, v8, Lcom/google/android/gms/internal/cast/M2;->b:Lcom/google/android/gms/internal/cast/N2;

    .line 187
    .line 188
    check-cast v9, Lcom/google/android/gms/internal/cast/I0;

    .line 189
    .line 190
    invoke-static {v9}, Lcom/google/android/gms/internal/cast/I0;->x(Lcom/google/android/gms/internal/cast/I0;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8}, Lcom/google/android/gms/internal/cast/M2;->e()V

    .line 194
    .line 195
    .line 196
    iget-object v9, v8, Lcom/google/android/gms/internal/cast/M2;->b:Lcom/google/android/gms/internal/cast/N2;

    .line 197
    .line 198
    check-cast v9, Lcom/google/android/gms/internal/cast/I0;

    .line 199
    .line 200
    invoke-static {v9}, Lcom/google/android/gms/internal/cast/I0;->w(Lcom/google/android/gms/internal/cast/I0;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8}, Lcom/google/android/gms/internal/cast/M2;->b()Lcom/google/android/gms/internal/cast/N2;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Lcom/google/android/gms/internal/cast/I0;

    .line 208
    .line 209
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/cast/N0;->h(Lcom/google/android/gms/internal/cast/I0;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7}, Lcom/google/android/gms/internal/cast/M2;->b()Lcom/google/android/gms/internal/cast/N2;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    check-cast v7, Lcom/google/android/gms/internal/cast/O0;

    .line 217
    .line 218
    iget-object v6, v6, Lcom/google/android/gms/internal/cast/s0;->a:Lcom/google/android/gms/internal/cast/Y;

    .line 219
    .line 220
    const/16 v8, 0xe8

    .line 221
    .line 222
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/cast/Y;->a(Lcom/google/android/gms/internal/cast/O0;I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cast/w;->a()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method
