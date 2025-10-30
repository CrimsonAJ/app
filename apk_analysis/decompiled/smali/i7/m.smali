.class public final Li7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lz7/a;


# direct methods
.method public synthetic constructor <init>(Lz7/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Li7/m;->a:I

    iput-object p1, p0, Li7/m;->b:Lz7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    iget-object v1, p0, Li7/m;->b:Lz7/a;

    .line 4
    .line 5
    iget v2, p0, Li7/m;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Lz7/a;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LX/h;

    .line 15
    .line 16
    new-instance v1, Lm7/n;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lm7/n;-><init>(LX/h;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast v1, Ll7/c;

    .line 23
    .line 24
    iget-object v0, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/content/Context;

    .line 27
    .line 28
    new-instance v1, Lm7/a;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lm7/a;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    check-cast v1, Ll7/c;

    .line 35
    .line 36
    iget-object v0, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/content/Context;

    .line 39
    .line 40
    new-instance v1, Li7/c0;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Li7/c0;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_2
    check-cast v1, Ll7/c;

    .line 47
    .line 48
    iget-object v1, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lb7/c;

    .line 56
    .line 57
    sget-object v2, Li7/q;->f:Li7/q;

    .line 58
    .line 59
    invoke-direct {v0, v2}, Lb7/c;-><init>(LO7/l;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Li7/r;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-direct {v2, v1, v3}, Li7/r;-><init>(Landroid/content/Context;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v2}, Lb0/f;->a(Lb7/c;LO7/a;)Lb0/d;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_3
    check-cast v1, Ll7/c;

    .line 74
    .line 75
    iget-object v1, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lb7/c;

    .line 83
    .line 84
    sget-object v2, Li7/q;->e:Li7/q;

    .line 85
    .line 86
    invoke-direct {v0, v2}, Lb7/c;-><init>(LO7/l;)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Li7/r;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-direct {v2, v1, v3}, Li7/r;-><init>(Landroid/content/Context;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v2}, Lb0/f;->a(Lb7/c;LO7/a;)Lb0/d;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :pswitch_4
    check-cast v1, Ll7/c;

    .line 101
    .line 102
    iget-object v0, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ll6/f;

    .line 105
    .line 106
    const-string v1, "firebaseApp"

    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Li7/O;->a:Li7/O;

    .line 112
    .line 113
    invoke-static {v0}, Li7/O;->a(Ll6/f;)Li7/b;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_5
    check-cast v1, Ll7/c;

    .line 119
    .line 120
    iget-object v0, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LS6/b;

    .line 123
    .line 124
    new-instance v1, Li7/l;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Li7/l;-><init>(LS6/b;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
