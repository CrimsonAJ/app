.class public final synthetic Lc2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc2/i;


# direct methods
.method public synthetic constructor <init>(Lc2/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc2/d;->a:I

    iput-object p1, p0, Lc2/d;->b:Lc2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lc2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc2/d;->b:Lc2/i;

    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lc2/i;->E0:Li0/o;

    .line 9
    .line 10
    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Li0/o;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    new-instance v1, LM1/D;

    .line 17
    .line 18
    const v2, 0x7f140180

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, LM1/D;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, LM1/n;->o0(LM1/E;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object v0, LA7/n;->a:LA7/n;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Lc2/d;->b:Lc2/i;

    .line 31
    .line 32
    invoke-virtual {v0}, Li0/v;->Y()Li0/v;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method
