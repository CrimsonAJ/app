.class public final LK1/a;
.super Lx8/p;
.source "SourceFile"


# instance fields
.field public b:J

.field public final synthetic c:LK1/b;


# direct methods
.method public constructor <init>(LK1/b;Lx8/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/a;->c:LK1/b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lx8/p;-><init>(Lx8/I;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final b0(Lx8/g;J)J
    .locals 7

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lx8/p;->b0(Lx8/g;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-object p3, p0, LK1/a;->c:LK1/b;

    .line 11
    .line 12
    iget-object v0, p3, LK1/b;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lq2/u;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-wide v0, p0, LK1/a;->b:J

    .line 19
    .line 20
    const-wide/16 v2, -0x1

    .line 21
    .line 22
    cmp-long v2, p1, v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-wide v2, p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    :goto_0
    add-long/2addr v0, v2

    .line 31
    iput-wide v0, p0, LK1/a;->b:J

    .line 32
    .line 33
    const/16 v2, 0x64

    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    mul-long/2addr v0, v2

    .line 37
    iget-object v2, p3, LK1/b;->b:Li8/N;

    .line 38
    .line 39
    invoke-virtual {v2}, Li8/N;->a()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    div-long/2addr v0, v3

    .line 44
    long-to-int v0, v0

    .line 45
    iget-wide v3, p0, LK1/a;->b:J

    .line 46
    .line 47
    const/16 v1, 0x400

    .line 48
    .line 49
    int-to-long v5, v1

    .line 50
    div-long/2addr v3, v5

    .line 51
    invoke-virtual {v2}, Li8/N;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    div-long/2addr v1, v5

    .line 56
    iget-object p3, p3, LK1/b;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p3, Lq2/u;

    .line 59
    .line 60
    iget v1, p3, Lq2/u;->a:I

    .line 61
    .line 62
    packed-switch v1, :pswitch_data_0

    .line 63
    .line 64
    .line 65
    iget-object p3, p3, Lq2/u;->b:Lq2/x;

    .line 66
    .line 67
    iget-object p3, p3, Lq2/x;->h:Lb8/Q;

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-virtual {p3, v1, v0}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_0
    iget-object p3, p3, Lq2/u;->b:Lq2/x;

    .line 82
    .line 83
    iget-object p3, p3, Lq2/x;->h:Lb8/Q;

    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-virtual {p3, v1, v0}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_1
    return-wide p1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method
