.class public final Lco/notix/tf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/uf;


# static fields
.field public static final synthetic c:Lco/notix/tf;


# instance fields
.field public final synthetic b:Lco/notix/vf;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/tf;

    invoke-direct {v0}, Lco/notix/tf;-><init>()V

    sput-object v0, Lco/notix/tf;->c:Lco/notix/tf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->r()Lco/notix/vf;

    move-result-object v0

    iput-object v0, p0, Lco/notix/tf;->b:Lco/notix/vf;

    return-void
.end method
