.class public final Lb5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lb5/A;


# direct methods
.method public synthetic constructor <init>(Lb5/A;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lb5/v;->a:I

    iput-wide p2, p0, Lb5/v;->b:J

    iput-object p1, p0, Lb5/v;->c:Lb5/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lb5/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/v;->c:Lb5/A;

    .line 7
    .line 8
    check-cast v0, Lb5/d1;

    .line 9
    .line 10
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lb5/n0;

    .line 13
    .line 14
    iget-object v1, v1, Lb5/n0;->q:Lb5/z;

    .line 15
    .line 16
    invoke-static {v1}, Lb5/n0;->c(Lb5/A;)V

    .line 17
    .line 18
    .line 19
    iget-wide v2, p0, Lb5/v;->b:J

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lb5/z;->o0(J)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-object v1, v0, Lb5/d1;->e:Lb5/a1;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, Lb5/v;->c:Lb5/A;

    .line 29
    .line 30
    check-cast v0, Lb5/z;

    .line 31
    .line 32
    iget-wide v1, p0, Lb5/v;->b:J

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lb5/z;->r0(J)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
