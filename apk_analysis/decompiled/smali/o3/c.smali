.class public final Lo3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC4/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo3/e;


# direct methods
.method public synthetic constructor <init>(Lo3/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo3/c;->a:I

    iput-object p1, p0, Lo3/c;->b:Lo3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LC4/o;)V
    .locals 3

    .line 1
    iget v0, p0, Lo3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv4/r;

    .line 7
    .line 8
    invoke-interface {p1}, LC4/o;->d()Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x837

    .line 17
    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    const-string v0, "Seek failed. Error code "

    .line 21
    .line 22
    const-string v1, ": "

    .line 23
    .line 24
    invoke-static {v0, p1, v1}, LA0/a;->p(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1}, LO4/h;->w(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "CastPlayer"

    .line 40
    .line 41
    invoke-static {v0, p1}, Ll4/a;->t(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p1, p0, Lo3/c;->b:Lo3/e;

    .line 45
    .line 46
    iget v0, p1, Lo3/e;->v:I

    .line 47
    .line 48
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    iput v0, p1, Lo3/e;->v:I

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    iget v0, p1, Lo3/e;->w:I

    .line 55
    .line 56
    iput v0, p1, Lo3/e;->t:I

    .line 57
    .line 58
    const/4 v0, -0x1

    .line 59
    iput v0, p1, Lo3/e;->w:I

    .line 60
    .line 61
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    iput-wide v1, p1, Lo3/e;->x:J

    .line 67
    .line 68
    new-instance v1, LX0/k;

    .line 69
    .line 70
    const/16 v2, 0x16

    .line 71
    .line 72
    invoke-direct {v1, v2}, LX0/k;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p1, Lo3/e;->j:Ll4/l;

    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Ll4/l;->e(ILl4/i;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :pswitch_0
    check-cast p1, Lv4/r;

    .line 82
    .line 83
    iget-object p1, p0, Lo3/c;->b:Lo3/e;

    .line 84
    .line 85
    iget-object v0, p1, Lo3/e;->o:Lv4/h;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lo3/e;->w0(Lo3/c;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, Lo3/e;->j:Ll4/l;

    .line 93
    .line 94
    invoke-virtual {p1}, Ll4/l;->b()V

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void

    .line 98
    :pswitch_1
    check-cast p1, Lv4/r;

    .line 99
    .line 100
    iget-object p1, p0, Lo3/c;->b:Lo3/e;

    .line 101
    .line 102
    iget-object v0, p1, Lo3/e;->o:Lv4/h;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Lo3/e;->u0(Lo3/c;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, Lo3/e;->j:Ll4/l;

    .line 110
    .line 111
    invoke-virtual {p1}, Ll4/l;->b()V

    .line 112
    .line 113
    .line 114
    :cond_3
    return-void

    .line 115
    :pswitch_2
    check-cast p1, Lv4/r;

    .line 116
    .line 117
    iget-object p1, p0, Lo3/c;->b:Lo3/e;

    .line 118
    .line 119
    iget-object v0, p1, Lo3/e;->o:Lv4/h;

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Lo3/e;->v0(Lo3/c;)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p1, Lo3/e;->j:Ll4/l;

    .line 127
    .line 128
    invoke-virtual {p1}, Ll4/l;->b()V

    .line 129
    .line 130
    .line 131
    :cond_4
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
