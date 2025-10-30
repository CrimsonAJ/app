.class public final Lb5/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb5/d1;


# direct methods
.method public synthetic constructor <init>(Lb5/d1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/c1;->a:I

    iput-object p1, p0, Lb5/c1;->b:Lb5/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lb5/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lb5/c1;->b:Lb5/d1;

    .line 8
    .line 9
    iput-object v0, v1, Lb5/d1;->j:Lb5/a1;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lb5/c1;->b:Lb5/d1;

    .line 13
    .line 14
    iget-object v1, v0, Lb5/d1;->j:Lb5/a1;

    .line 15
    .line 16
    iput-object v1, v0, Lb5/d1;->e:Lb5/a1;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
