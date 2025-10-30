.class public final Lb5/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p7, p0, Lb5/s0;->a:I

    iput-object p2, p0, Lb5/s0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/s0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb5/s0;->e:Ljava/lang/Object;

    iput-wide p5, p0, Lb5/s0;->d:J

    iput-object p1, p0, Lb5/s0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lb5/s0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/s0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v1, "screen_name"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "screen_class"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lb5/s0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lb5/d1;

    .line 24
    .line 25
    iget-object v1, v2, LD/n;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lb5/n0;

    .line 28
    .line 29
    iget-object v1, v1, Lb5/n0;->l:Lb5/P1;

    .line 30
    .line 31
    invoke-static {v1}, Lb5/n0;->d(LD/n;)V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const-string v5, "screen_view"

    .line 37
    .line 38
    invoke-virtual {v1, v5, v0, v3, v4}, Lb5/P1;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    iget-object v0, p0, Lb5/s0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    check-cast v3, Lb5/a1;

    .line 46
    .line 47
    iget-object v0, p0, Lb5/s0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    check-cast v4, Lb5/a1;

    .line 51
    .line 52
    iget-wide v5, p0, Lb5/s0;->d:J

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    invoke-virtual/range {v2 .. v8}, Lb5/d1;->q0(Lb5/a1;Lb5/a1;JZLandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    iget-object v12, p0, Lb5/s0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    iget-wide v10, p0, Lb5/s0;->d:J

    .line 62
    .line 63
    iget-object v0, p0, Lb5/s0;->f:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v9, v0

    .line 66
    check-cast v9, Lb5/S0;

    .line 67
    .line 68
    iget-object v0, p0, Lb5/s0;->b:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v13, v0

    .line 71
    check-cast v13, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, p0, Lb5/s0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v14, v0

    .line 76
    check-cast v14, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual/range {v9 .. v14}, Lb5/S0;->G0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_1
    iget-object v0, p0, Lb5/s0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v1, p0, Lb5/s0;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lb5/w0;

    .line 89
    .line 90
    iget-object v2, p0, Lb5/s0;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Ljava/lang/String;

    .line 93
    .line 94
    if-nez v2, :cond_1

    .line 95
    .line 96
    iget-object v1, v1, Lb5/w0;->e:Lb5/J1;

    .line 97
    .line 98
    invoke-virtual {v1}, Lb5/J1;->K()Lb5/m0;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Lb5/m0;->l0()V

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, Lb5/J1;->Z:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v2, :cond_0

    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_0

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_0
    iput-object v0, v1, Lb5/J1;->Z:Ljava/lang/String;

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    iput-object v0, v1, Lb5/J1;->Y:Lb5/a1;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    new-instance v3, Lb5/a1;

    .line 123
    .line 124
    iget-object v4, p0, Lb5/s0;->e:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v4, Ljava/lang/String;

    .line 127
    .line 128
    iget-wide v5, p0, Lb5/s0;->d:J

    .line 129
    .line 130
    invoke-direct {v3, v5, v6, v4, v2}, Lb5/a1;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v1, Lb5/w0;->e:Lb5/J1;

    .line 134
    .line 135
    invoke-virtual {v1}, Lb5/J1;->K()Lb5/m0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Lb5/m0;->l0()V

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, Lb5/J1;->Z:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v2, :cond_2

    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_2
    iput-object v0, v1, Lb5/J1;->Z:Ljava/lang/String;

    .line 150
    .line 151
    iput-object v3, v1, Lb5/J1;->Y:Lb5/a1;

    .line 152
    .line 153
    :goto_0
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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
